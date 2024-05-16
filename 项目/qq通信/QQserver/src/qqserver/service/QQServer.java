package qqserver.service;/*
 *@author yang
 这是服务端，监听9999，等待客户端的连接并保持通讯
 */

import qqcommon.Message;
import qqcommon.MessageType;
import qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class QQServer {
    private ServerSocket ss = null;
    //创建一个集合存放多个用户，存放多个用户，如果是这些用户登陆，就认为是合法的
    //也可以使用ConcurrtentHashMap，可以处理并发的集合，没有线程安全的问题
    //HashMap没有处理线程安全，因此在多线程情况下是不安全的
    //ConcurrentHashMap 处理了线程安全，即线程同步处理，在多线程情况下是安全的
    private static ConcurrentHashMap<String,User> validUsers = new ConcurrentHashMap<>();
    static { //在静态代码块初始化validUsers
        validUsers.put("100",new User("100","123456"));
        validUsers.put("200",new User("200","123456"));
        validUsers.put("300",new User("300","123456"));
        validUsers.put("至尊宝",new User("至尊宝","123456"));
        validUsers.put("紫霞仙子",new User("紫霞仙子","123456"));
        validUsers.put("菩提老祖",new User("菩提老祖","123456"));

    }
    //验证用户是否有效的方法
    private boolean checkUser(String userId,String passwd) {
        User user = validUsers.get(userId);
        if (user == null) { //说明userId没有存在validUsers的key中
            return false;
        }
        if (!user.getPassword().equals(passwd)) { //userId正确，但是密码错误
            return false;
        }
        return true;
    }

    public QQServer() {
        // 端口可以写在配置文件
        try {
            System.out.println("服务端在9998端口监听");
            ss = new ServerSocket(8889);

            while(true) { //监听是循环的，当个某个客户端连接后，继续监听
                Socket socket = ss.accept(); //如果有客户端连接上了，就继续执行
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

                //得到socket关联的对象输出流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                User u = (User) ois.readObject(); //读取客户端发送的User对象
                //创建一个Message对象，准备回复客户端
                Message message = new Message();
                //验证用户方法
                if (checkUser(u.getUserId(),u.getPassword())) { //登陆成功
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //将message对象回复客户端
                    oos.writeObject(message);
                    //创建一个线程，和客户端保持通信，该线程需要持有socket对象
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket, u.getUserId());
                    //启动该线程
                    serverConnectClientThread.start();
                    //把该线程对象放入到一个集合中进行管理
                    ManageClientThreads.addClientThread(u.getUserId(),serverConnectClientThread);

                } else { //登陆失败
                    System.out.println("用户id= "+ u.getUserId() + "pwd= "+ u.getPassword() +"验证失败");
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    socket.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //如果服务端退出来while，说明服务器端不再监听，因此关闭资源
            try {
                ss.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
