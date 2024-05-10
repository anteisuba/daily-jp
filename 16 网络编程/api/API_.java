package 网络编程.api;/*
import java.net.InetAddress;
 *@author yang
 演示InetAddress类的使用
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {

    public static void main(String[] args) throws UnknownHostException {
        //获取本机InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost); //DreamtankdeMacBook-Pro-2.local/192.168.1.86

        //根据指定的主机名获取InetAddress对象
        InetAddress byName = InetAddress.getByName("DreamtankdeMacBook-Pro-2.local");
        System.out.println(byName);

        //根据域名返回InetAddress对象，比如www.google.com
        InetAddress byName1 = InetAddress.getByName("www.google.com");
        System.out.println(byName1);

        //通过InetAddress对象，获取对应的地址
        String hostAddress = byName1.getHostAddress();
        System.out.println("hostAddress" + hostAddress);

    }
}
