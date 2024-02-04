package 面向对象中级.二访问修饰符.hspedu.pkg;

import 面向对象中级.二访问修饰符.hspedu.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1); //在不同包下，可以访问的只有public
        a.m1(); //只能访问m1
    }
}
