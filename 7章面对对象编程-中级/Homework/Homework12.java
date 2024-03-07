package 面向对象中级.homework;

public class Homework12 {
    public static void main(String[] args) {
        C c = new C(); //C类无参构造器 - C类有参构造器 - hahaha + B类有参构造器 - 我是A类

    }
}
class A {
    public A() {
        System.out.println("我是A类");
    }
}
class B extends A {
    public B() {
        System.out.println("我是B类无参构造器");
    }
    public B(String name) {
        System.out.println(name + "我是B类的有参构造器");
    }
}
class C extends B {
    public C() {
        this("hello");
        System.out.println("我是c类的无参构造器");
    }
    public C(String name) {
        super("hahaha");
        System.out.println("我是c类的有参构造器");
    }
}