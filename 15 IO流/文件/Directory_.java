package IO流.文件;/*
 *@author yang
 */

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.InputStream;

public class Directory_ {
    public static void main(String[] args) {
        A a = new A();
        a.m3();


//        String directoryPath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/文件/demo";
//        File directory = new File(directoryPath);
//        if (directory.exists()) {
//            if (directory.isDirectory()) {
//                if (directory.delete()) {
//                    System.out.println("目录删除成功");
//                } else {
//                    System.out.println("目录删除失败");
//                }
//            } else {
//                System.out.println("指定路径不是一个目录");
//            }
//        } else {
//            System.out.println("目录不存在");
//        }




    }

    //判断scr/IO文件/new3.txt 是否存在，如果存在就删除
//    @Test
//    public void m1() {
//        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/文件/new3.txt";
//        File file = new File(filePath);
//        if (file.exists()) {
//            if (file.delete()) {
//                System.out.println("删除成功" + filePath);
//            } else  {
//                System.out.println("删除失败" + filePath);
//            }
//        } else {
//            System.out.println("该文件不存在");
//        }
//    }

    //判断目录是否存在，如果存在就删除，否则提示不存在
    //在Java中，目录也是文件
//    @Test
//    public void m2() {
//        String directoryPath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/文件/demo";
//        File file = new File(directoryPath);
//        if (file.exists()) {
//            if (file.isDirectory()) {
//                if (file.delete()) {
//                    System.out.println("删除成功" + directoryPath);
//                } else {
//                    System.out.println("删除失败" + directoryPath);
//                }
//            }
//
//        } else {
//            System.out.println("该目录不存在");
//        }
//    }


}
class A {
    @Test
    public void m3() {
        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/文件/demo";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("目录存在");
        } else {
            if (file.mkdirs()) { //创建多级目录用mkdirs
                System.out.println(filePath + "创建成功");
            } else {
                System.out.println(filePath + "创建失败");
            }
        }
    }

}
