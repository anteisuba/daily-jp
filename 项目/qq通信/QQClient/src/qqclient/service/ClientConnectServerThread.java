package qqclient.service;/*
 *@author yang
 线程（socket）
 */

import qqcommon.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientConnectServerThread extends Thread{
    //该线程需要持有Socket
    private Socket socket;

    //构造器接收Socket对象
    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    //
    @Override
    public void run() {
        //因为Thread需要在后台和服务器通信，因此我们while循环
        while (true) {
            try {
                System.out.println("客户端线程，等待读取从服务器发送的消息");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                //如果服务器没有发送Message对象，readObject对象，线程会阻塞



            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

    public Socket getSocket() {
        return socket;
    }
}
