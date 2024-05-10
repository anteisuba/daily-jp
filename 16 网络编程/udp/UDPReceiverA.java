package 网络编程.udp;/*
 *@author yang
 接收端，等待接受数据
 */


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //创建一个DatagramSocket对象，准备在9999接受数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        //构建一个DatagramPacket对象，准备接受数据
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //调用接受方法,通过网络传输的DatagramPakcet对象填充到packet对象
        datagramSocket.receive(packet);
        System.out.println("接收端A等待接收数据");
        //把packet进行拆包，取出数据，并显示
        int length = packet.getLength(); //实际接收到的数据长度
        byte[] data = packet.getData();
        java.lang.String s = new java.lang.String(data, 0, length);
        System.out.println(s);

        //将需要的数据发送
        byte[] bytes = "好的，明天见".getBytes();
        DatagramPacket packet1 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.1.86"), 9998);
        datagramSocket.send(packet1);

        //关闭资源
        datagramSocket.close();

        System.out.println("A端退出");




    }
}
