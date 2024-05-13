package qqclient.service;/*
 *@author yang
 该类完成用户登陆验证和用户注册等等功能
 */

import qqcommon.Message;
import qqcommon.MessageType;
import qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class UserClientService {

    private User u = new User(); //可能在其他地方使用User信息，因此做成成员属性
    private Socket socket; //可能在其他地方使用Socket信息，因此做成成员属性

    //根据userId和pwd到服务器验证该用户是否合法
    public boolean checkUser(String userId,String pwd){
        boolean b = false;
        //创建User对象
        u.setUserId(userId);
        u.setPassword(pwd);
        //连接到服务端，发送u对象
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            //得到ObjectOutputStream对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u); //发送user对象

            //读取从服务端回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();

            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_FAIL)) { //登陆成功
                b = true;
                //创建一个和服务器端保持通讯的线程-> 创建一个类 ClientConnectServerThread
                ClientConnectServerThread ccst = new ClientConnectServerThread(socket);
                ccst.start(); //启动
                //为了客户端扩展，我们将线程放入集合中管理
                ManageClientConnectServerThread.addClientConnentServerThread(userId,ccst);
                b = true;

            } else {
                //如果失败，就不能启动和服务器通信的线程，关闭socket
                socket.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return b;

    }
}
