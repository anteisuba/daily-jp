package 反射.classload_;/*
 *@author yang
 演示类加载的初始化阶段
 */

public class ClassLoad03 {
    public static void main(String[] args) {
        //加载B类，并生成B的class对象
        //链接num = 0
        //初始化阶段 依次自动收集类中的所有静态变量的赋值动作和静态代码块中的语句,并合并
        // clint() {}
        new B();
    }
}
class B {
    static {
        System.out.println("B 静态代码块被执行");
        num = 300;
    }

    static int num = 100;
    public B() {
        System.out.println("B 构造器被执行");
    }
}
