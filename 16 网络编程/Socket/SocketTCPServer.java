package 网络编程.Socket;/*
 *@author yang
 */



import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCPServer {
    public static void main(String[] args) throws IOException {
        //在本机9999端口监听,等待连接，要求在本机没有其他服务在监听9999
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接");
        //当没有客户端连接9999端口时，程序会阻塞，等待连接
        //如果有客户端连接，则会返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("socket=" + socket.getClass());
        //通过socket.getInputStream()读取
        InputStream inputStream = socket.getInputStream();
        //IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new java.lang.String(buf,0,readLen)); //根据读取到的实际长度，显示内容
        }

        //关闭流和socket
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
