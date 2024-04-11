package IO流.IO流原理;/*
 *@author yang
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝
        //创建文件的输入流，将文件读入到程序
        //创建文件的输出流，将读取到的文件数据，写入到指定的文件
        String filePath = "/Users/dreamtank/JDK/IDEAtest/out/production/IDEAtest/IO流/IO流原理/boom1.jpeg";
        String destFilePath = "/Users/dreamtank/JDK/IDEAtest/out/production/IDEAtest/IO流/文件/boom1.jpeg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {

            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义字节数组，提高读写效率
            byte[] buf =new byte[1024];
            int readLen = 0;
            while((readLen = fileInputStream.read(buf)) != -1) {
                //读取到后，就写入文件 通过fileOutputStream
                fileOutputStream.write(buf,0,readLen);
            }
            System.out.println("拷贝ok");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭输入流和输出流，释放资源
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
