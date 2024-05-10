package 网络编程.udp;/*
 *@author yang
 发送端B
 */

import java.io.IOException;
import java.net.*;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象，准备在9998端口接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //将需要发送的数据，封装到DatagramPacket对象
        byte[] data = "hello mingtyian".getBytes();
        DatagramPacket packet = new DatagramPacket(data,data.length, InetAddress.getByName("192.168.1.86"),9999);

        socket.send(packet);

        byte[] buf = new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(buf, buf.length);
        socket.receive(packet1);
        System.out.println("接收B端数据");

        int length = packet1.getLength();
        byte[] data1 = packet1.getData();
        String s = new String(data1, 0, length);
        System.out.println(s);


        socket.close();

        System.out.println("B端退出");


    }
}
