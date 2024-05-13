package 网络编程;/*
 *@author yang
 先写文件下载的服务端
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework03Server {
    public static void main(String[] args) throws Exception {
        //监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        //等待客户端连接
        Socket socket = serverSocket.accept();
        //读取客户端发送的要下载的文件名
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downloadFileName = "";
        while ((inputStream.read(b)) != -1) {
            downloadFileName += new String(b,0,len);
        }

        System.out.println("客户端希望下载的文件名" + downloadFileName);
        //服务器上有两个文件
        //

        String resFileName = "";
        //创建一个输入流，读取文件
        if ("高山流水".equals(downloadFileName)) {
            resFileName = "/Users/dreamtank/JDK/IDEAtest/src/网络编程/高山流水.mp3";
        } else {
            resFileName = "/Users/dreamtank/JDK/IDEAtest/src/网络编程/无名.mp3";
        }

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(resFileName));
        // 使用工具类StreamUtils，读取文件到一个字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        //得到Socket关联的输出流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        socket.shutdownOutput();

        //关闭相关的资源
        bufferedInputStream.close();

        socket.close();
        inputStream.close();
        serverSocket.close();
    }
}
