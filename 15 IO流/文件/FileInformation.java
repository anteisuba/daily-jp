package IO流.文件;/*
 *@author yang
 */

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info() {
        //先创建文件对象
        File file = new File("src/IO流/文件/new3.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //调用相应的方法，得到对应的信息
        System.out.println("文件名字=" + file.getName());
        System.out.println("文件绝对路径" + file.getAbsolutePath());
        System.out.println("文件父目录" + file.getParent());
        System.out.println("文件大小（字节）" + file.length());
        System.out.println("文件是否存在" + file.exists());
        System.out.println("是不是一个文件" + file.isFile());
        System.out.println("是不是一个目录" + file.isDirectory());

    }
}
