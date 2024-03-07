package 面向对象高级.代码块;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        //1 类的加载
        //1.1 先加载父类A02 1.2在加载B02
        //2 创建对象
        //2.1 从子类的构造器 2.2
        new B02();
    }
}

class A02 {
    private static int n1 = getVal01();   //01
    static {
        System.out.println("A02的静态代码块");  //02
    }
    {
        System.out.println("A02的普通代码块");  //05
    }
    public int n3 = getVal02();  //06
    public static int getVal01() {
        System.out.println("getVal01");
        return 10;
    }
    public int getVal02() {
        System.out.println("getVal02");
        return 10;
    }
    public A02() {
        System.out.println("A02的构造器");  //07
    }
}
class C02 {
    private int n1 = 100;
    private static int n2 = 200;
    private void m1() {

    }
    private static void m2() {

    }
    static {
        //静态代码块只能调用静态成员
        //System.out.println(n1);
        System.out.println(n2);
        //m1();
        m2();
    }
    {
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2();
    }
}

class B02 extends A02 {
    private static int n3 = getVal03();  //03
    static {
        System.out.println("B02的静态代码块");  //04

    }
    public int n5 = getVal04();  //08
    {
        System.out.println("B02的普通代码块"); //09
    }
    public static int getVal03() {
        System.out.println("getVal03");
        return 10;
    }
    public int getVal04() {
        System.out.println("getVal04");
        return 10;
    }
    public B02() {
        super();
        //普通代码块
        System.out.println("B02的构造器");  //10
    }



}
