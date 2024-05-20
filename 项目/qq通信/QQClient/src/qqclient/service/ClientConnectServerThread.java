package qqclient.service;/*
 *@author yang
 线程（socket）
 */

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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
                //判断message类型，然后做相应的业务处理
                //如果是读取到的是 服务端返回的在线用户列表
                if (message.getMesType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)) {
                    //取出在线列表信息，并显示
                    //规定：
                    String[] onlineUsers = message.getContent().split(" ");
                    System.out.println("====当前在线用户列表如下====");
                    for (int i = 0; i < onlineUsers.length; i++) {
                        System.out.println("用户：" + onlineUsers[i]);
                    }

                } else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) { //普通的聊天消息
                    //把从服务器转发的消息，显示到控制台即可
                    System.out.println("\n" + message.getSender() + "对" + message.getGetter() + "说：" + message.getContent());

                } else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALl_MES)) {
                    //显示在客户端的控制台
                    System.out.println("\n" + message.getSender() + " 对大家说： " + message.getContent());
                } else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)) {
                    System.out.println("\n" + message.getSender() + "给" + message.getGetter() + "发送文件" + message.getSrc() + "到我的电脑的目录" + message.getDest());
                    //取出message的文件字节数组，通过文件输出流写入到磁盘
                    FileOutputStream fileOutputStream = new FileOutputStream(message.getDest());
                    fileOutputStream.write(message.getFileBytes());
                    fileOutputStream.close();
                    System.out.println("\n 保存文件成功");
                } else {
                    System.out.println("是其他类型的message，暂时不处理");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

    public Socket getSocket() {
        return socket;
    }
}
