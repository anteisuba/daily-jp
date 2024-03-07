package 面向对象中级.二访问修饰符.hspedu.modifier;

public class B {
    //
    public static void main(String[] args) {

    }
    public void say() {
        A a = new A();
        //在同一个包下，可以访问public 默认 protected 不能访问private
        System.out.println("n1 " + a.n1 + "n2 " + a.n2 + "n3 " + a.n3 );  //不能访问n4
        a.m1();
        a.m2();
        a.m3();
    }


}
