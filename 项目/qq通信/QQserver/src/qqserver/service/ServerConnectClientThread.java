package qqserver.service;/*
 *@author yang
 该类的一个对象和某个客户保持通信
 */

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class ServerConnectClientThread extends Thread{
    private Socket socket;
    private String userId;
    public ServerConnectClientThread(Socket socket,String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() { //这里线程处于run的状态，可以发送/接收消息
        while (true) {
            try {
                System.out.println("服务端和客户端"+ userId +"保持通信，读取数据");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)) {
                    //客户端要在线用户列表
                    System.out.println(message.getSender() + "要在线用户列表");
                    String onlineUser = ManageClientThreads.getOnlineUser();
                    //返回message
                    //构建一个Message对象，返回给客户端对象
                    Message message2 = new Message();
                    message2.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    message2.setContent(onlineUser);
                    message2.setGetter(message.getSender());
                    //返回给客户端
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message2);

                } else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {
                    //根据message获取getter id，然后在得到对应的线程
                    ServerConnectClientThread serverConnectClientThread = ManageClientThreads.getServerConnectClientThread(message.getGetter());
                    //得到对应的socket的对象输出流，将message对象转发给指定的客户端
                    ObjectOutputStream oos = new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
                    oos.writeObject(message); //转发，如果客户不在线，可以保存到数据库，这样就可以实现离线留言
                } else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALl_MES)) {
                    //需要遍历ManageClientThreads的HashMap，取出所有排除自己
                    HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();
                    Iterator<String> iterator = hm.keySet().iterator();
                    while (iterator.hasNext()) {
                        //取出在线用户的id
                        String onLineUserId = iterator.next().toString();

                        if (!onLineUserId.equals(message.getSender())) { //排除群发消息的这个用户
                            //进行转发
                            ObjectOutputStream oos = new ObjectOutputStream(hm.get(onLineUserId).getSocket().getOutputStream());
                            oos.writeObject(message);
                        }
                    }
                } else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)) {
                    //根据getterid获取到对应的线程，将message对象转发
                    ServerConnectClientThread serverConnectClientThread = ManageClientThreads.getServerConnectClientThread(message.getGetter());
                    ObjectOutputStream oos = new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
                    //转发
                    oos.writeObject(message);
                } else if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {
                    System.out.println(message.getSender() + "退出");
                    //将客户端对应的线程，从集合中移除
                    ManageClientThreads.remove(message.getSender());
                    socket.close(); //关闭连接
                    //退出线程
                    break;
                } else {
                    
                    System.out.println("其他类型的message，暂时不处理");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }



}
