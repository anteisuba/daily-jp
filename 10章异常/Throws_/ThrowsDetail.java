package 异常.Throws_;/*
 *@author yang
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
    public static void main(String[] args) {

    }
    public static void f2() {
        //因为f3方法抛出一个编译异常，这时，就要去f1必须处理这个编译异常
        try {
            f3();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }

    public static void f4() {
        //f5抛出的是运行异常
        //而java中并不要求程序员显示处理，因为有默认处理
        f5();
    }

    public static void f5() throws ArithmeticException {

    }
}
class Father {
    public void method() throws RuntimeException {

    }
}
class Son extends Father {
    //子类重写的方法要么和父类一致，要么是父类异常的子类
    @Override
    public void method() throws NullPointerException {

    }
}