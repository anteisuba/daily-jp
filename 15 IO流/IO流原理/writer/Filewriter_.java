package IO流.IO流原理.writer;/*
 *@author yang
 */

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter_ {
    public static void main(String[] args) {
        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/Hello.txt";
        //创建FileWirter对象
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c','d'};
        try {
            fileWriter = new FileWriter(filePath,true);
            //writer(int) 写入单个字符
            fileWriter.write('H');
            //writer(char[]) 写入指定数组
            fileWriter.write(chars);
            //writer(char[],off,len):写入指定数组的指定的部分
            fileWriter.write("杨健123456".toCharArray(),0,3);
            //writer(String)：写入整个字符串
            fileWriter.write("你好北京");
            //writer(string,off,len):写入字符串的指定部分
            fileWriter.write("beijingnihao",0,4);



        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //对应FileWriter，一定要关闭流，或者flush才能真正的把数据写入到文件

            try {
                //fileWriter.flush();
                //关闭文件流，等于flush() + 关闭
               fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
