package IO流.IO流原理.transformation;/*
 *@author yang
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter_ {
    public static void main(String[] args) throws IOException {

        //PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter1 = new PrintWriter(new FileWriter("/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/Hello.txt"));
        printWriter1.print("hi,beijing");
        printWriter1.close(); //flash + 关闭流
    }
}
