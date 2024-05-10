package 网络编程.Socket;/*
 *@author yang
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Socket02Client {
    public static void main(String[] args) throws IOException {
//        Socket socket2 = new Socket(InetAddress.getLocalHost(), 8888);
//
//        OutputStream outputStream = socket2.getOutputStream();
//        outputStream.write("hello,server".getBytes());
//        //设置写入结束标记
//        socket2.shutdownOutput();
//        //获取和socket关联的输入流，读取数据，并显示
//        InputStream inputStream = socket2.getInputStream();
//        byte[] buf = new byte[1024];
//        int readLen = 0;
//        while ((readLen = inputStream.read(buf)) != -1) {
//            System.out.println(new String(buf,0,readLen));
//        }
//
//
//        socket2.close();
//        outputStream.close();
//        inputStream.close();
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("客户端 socket返回=" + socket.getClass());
        //2. 连接上后，生成Socket, 通过socket.getOutputStream()
        //   得到 和 socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3. 通过输出流，写入数据到 数据通道
        outputStream.write("hello, server".getBytes());
        //   设置结束标记
        socket.shutdownOutput();

        //4. 获取和socket关联的输入流. 读取数据(字节)，并显示
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        //5. 关闭流对象和socket, 必须关闭
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出.....");
    }
}
