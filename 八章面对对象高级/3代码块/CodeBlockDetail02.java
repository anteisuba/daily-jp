package 面向对象高级.代码块;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A(); //1 getN1 - 2 A

    }
}

class A {

    //静态属性的初始化
    static {  //静态代码块
        System.out.println("A 静态代码块");
    }
    private static int n1 = getN1();
    public static int getN1() {
        System.out.println("getN1被调用");
        return 100;
    }
}
