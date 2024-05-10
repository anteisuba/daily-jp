package 网络编程.Socket;/*
 *@author yang
 */

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //连接服务器（IP，端口）
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回=" + socket.getClass());
        //连接上后，生成Socket，通过socket.getOutputStream()
        OutputStream outputStream = socket.getOutputStream();
        //得到和Socket对象关联的输出流对象
        //通过输出流，写入数据到数据通道
        outputStream.write("hello,server".getBytes());
        //关闭流对象和socket，否则造成资源浪费
        outputStream.close();
        socket.close();
        System.out.println("客户端退出.....");

    }
}
