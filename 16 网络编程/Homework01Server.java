package 网络编程;/*
 *@author yang
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        System.out.println("服务端socket = " + socket.getClass());
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        String answer = "";
        if ("name".equals(s)) {
            answer = "我是杨健";
        } else if("hobby".equals(s)) {
            answer = "编写java程序";
        } else {
            answer = "你说什么";
        }


        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();

    }
}
