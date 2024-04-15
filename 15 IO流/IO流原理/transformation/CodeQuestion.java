package IO流.IO流原理.transformation;/*
 *@author yang
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //创建字符输入流，BufferedReader[处理流]
        //使用BufferedReader读取
        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/Hello.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String s = bufferedReader.readLine();
        System.out.println("读取到的内容" + s);
        bufferedReader.close();

    }
}
