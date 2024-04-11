package IO流.IO流原理;/*
 *@author yang
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/Hello.txt";
        FileReader fileReader = null;
        int data = 0;
        //先创建一个FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //单个字符读取
            while((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
