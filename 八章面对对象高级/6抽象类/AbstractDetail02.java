package 面向对象高级.抽象类;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}
//抽象类的本质还是类，所以可以有类的所有成员

abstract class E {
    public abstract void hi();
}

abstract class F extends E {

}
class G extends E {
    @Override
    public void hi() {
        System.out.println("实现父类的抽象方法");
    }
}

abstract class D {
    public int n1 = 10;
    public static String name = "韩顺平教育";
    public void hi() {
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok() {
        System.out.println("hi");
    }
}
