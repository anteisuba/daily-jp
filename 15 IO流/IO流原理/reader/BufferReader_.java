package IO流.IO流原理.reader;/*
 *@author yang
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/FileCopy.java";
        //创建bufferedReader对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line; //按行读取，效率高
        //bufferedReader.readLine(); 按行读取文件
        //返回null时，表示文件读取完毕

        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        //关闭流,只需要关闭BufferedReader,因为底层会自动关闭节点流
        bufferedReader.close();



    }
}
