package 面向对象高级.final方法;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
    }

}

class BBB {
    public final static int num = 10000;
    static {
        System.out.println("BBB静态代码块被执行");  //不会被加载
    }
}
final class AAA {
    public  void cry() {

    }
}
