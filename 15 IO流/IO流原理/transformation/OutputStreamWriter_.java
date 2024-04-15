package IO流.IO流原理.transformation;/*
 *@author yang
 */

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/Hello.txt";
        String charSet = "gbk";
        OutputStreamWriter gbk = new OutputStreamWriter(new FileOutputStream(filePath),"UTF-8");
        gbk.write("hi,yangjian杨健");
        gbk.close();
        System.out.println("按照" + charSet + "保存文件成功");


    }
}
