package IO流.IO流原理.writer;/*
 *@author yang
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWirter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/Hello.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("yangjian",0,4);
        bufferedWriter.newLine();//插入一个换行
        bufferedWriter.write("charuhuanhang");

        bufferedWriter.close();
    }
}
