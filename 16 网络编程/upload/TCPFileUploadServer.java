package 网络编程.upload;/*
 *@author yang
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口监听");
        Socket socket = serverSocket.accept();

        //读取客户端发送的数据
        //通过Socket得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //将得到bytes数组，写入到指定的路径，就得到一个文件了
        String destfile = "/Users/dreamtank/JDK/IDEAtest/src/网络编程/hoshino.jpeg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destfile));
        bos.write(bytes);
        bos.close();


        //向客户端回复“收到图片”
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片");
        writer.flush();
        socket.shutdownOutput();


        writer.close();
        bis.close();
        socket.close();
        serverSocket.close();


    }

}
