package IO流.IO流原理.reader;/*
 *@author yang
 */

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReader02 {
    public static void main(String[] args) {

    }
    @Test
    public void readFile02() {
        java.lang.String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/Hello.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        //先创建一个FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取，字符数组读取文件,返回的是实际读取到的字符数
            //如果返回-1，说明到文件结束
            while((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new java.lang.String(buf,0,readLen));
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
