package 异常.Throws_;/*
 *@author yang
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }
    public void f1() throws FileNotFoundException,NullPointerException,ArithmeticException{
        //创建一个文件流对象
        //异常处理方法 FileNotFoundException 编译异常
        // try catch finally
        // throws 抛出异常，让调用f1方法的调用者处理
        // throws 后面的异常类型可以是方法中产生的异常类型，也可以是他的父类
        // throws 关键字后也可以是 异常列表，即可以抛出多个异常



//        try {
//            FileInputStream fis = new FileInputStream("d://aa.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}
