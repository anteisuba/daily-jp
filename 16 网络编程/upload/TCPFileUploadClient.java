package 网络编程.upload;/*
 *@author yang
 */

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket(InetAddress.getLocalHost(),8888);

        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/网络编程/upload/boom1.jpeg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        //bytes 就是文件对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //通过socket获取到输出流，将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes); //将文件对应的字节数组的内容，写入到数据通道

        bis.close();
        socket.shutdownOutput();//设置写入数据的结束标记

        InputStream inputStream = socket.getInputStream();

        //使用StreamUtils的方法，直接将inputStream读取到的内容，转成字符串
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        bos.close();
        socket.close();


    }
}
