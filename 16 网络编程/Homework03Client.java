package 网络编程;/*
 *@author yang
 */

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Homework03Client {
    public static void main(String[] args) throws Exception {
        //接收用户输入，指定下载文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载文件名");
        String downloadFileName = scanner.next();
        //客户端连接服务端，准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //获取和Socket关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
        //设置写入结束的标志
        socket.shutdownOutput();

        //读取服务端返回的文件（字节数据）
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //得到一个输出流，准备将bytes写入磁盘
        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/网络编程" + downloadFileName + ".mp3";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);

        //关闭相关资源
        bos.close();
        bis.close();
        outputStream.close();
        socket.close();

        System.out.println("客户端下载完毕，退出");


    }
}
