package IO流.IO流原理;/*
 *@author yang
 */

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    /*
    * 演示使用FileOutputStream 将数据写到文件中
    * 如果该文件不存在，则创建文件
    * */
    @Test
    public void wirteFile() {
        //创建FileOutputStream对象

        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/Hello.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //得到FileOutputStream对象
            //如果不想覆盖原先的文件fileOutputStream = new FileOutputStream(filePath。true);
            //追加到文件的后面
            fileOutputStream = new FileOutputStream(filePath,true);
            fileOutputStream.write('Y');
            String str = "hello,world";
            fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(),0,str.length());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
