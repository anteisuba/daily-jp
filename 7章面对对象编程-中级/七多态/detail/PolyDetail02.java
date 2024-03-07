package 面向对象中级.五多态.detail;

public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub();  //向上转型
        System.out.println(base.count);  //看编译类型 10
        Sub sub = new Sub();
        Sub sub1 = (Sub)base;
        System.out.println(sub1.string);
        System.out.println(sub.count);
    }
}

class Base {
    int count = 10;
}
class Sub extends Base {
    int count = 20;
    String string = "yang";
}
