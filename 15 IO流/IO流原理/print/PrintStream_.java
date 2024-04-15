package IO流.IO流原理.print;/*
 *@author yang
 */

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //默认情况下，PrintStream输出数据的位置是 标准输出 即显示器
        out.print("john.hello");
        //因为print底层使用的是write，所以我们可以直接调用write进行打印 输出
        out.write("yangjian".getBytes());
        out.close();

        //我们可以修改打印流输出的位置/设备
        System.setOut(new PrintStream("/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/Hello.txt"));
        System.out.println("hello hanshuping");
    }
}
