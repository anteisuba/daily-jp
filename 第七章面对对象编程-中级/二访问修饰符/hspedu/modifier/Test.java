package 面向对象中级.二访问修饰符.hspedu.modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        B b = new B();
        b.say();
    }
}

//只有默认和public可以修饰类
class Tiger {

}