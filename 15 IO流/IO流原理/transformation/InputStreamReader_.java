package IO流.IO流原理.transformation;/*
 *@author yang
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//转成字符流，指定编码gbk/utf-8
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/Hello.txt";
        //new FileInputStream()转成InputStreamReader
        //同时指定编码 gbk

//        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath),"gbk");
//        //把InputStreamReader传入BufferedReader 效率高
//        BufferedReader br = new BufferedReader(inputStreamReader);

        //合在一起写
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
        String s = br.readLine();
        System.out.println(s);
        br.close();

    }
}
