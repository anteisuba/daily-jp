package 面向对象高级.类变量和类方法;

public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();
        //非静态方法不能通过类名调用
        new D().say();
    }
}

class D {
    private int n1 = 100;
    private static int n2 = 200;
    public void say() {
        System.out.println(n1);
        hi();
        hello();
    }
    public static void hi() {
        //System.out.println(this.n1); 不能使用this和super
    }

    public static void hello() {
        System.out.println(n2);
        //System.out.println(n1);  //无法访问
        System.out.println(D.n2);
        hi();
        //say();  非静态无法访问
        //口诀：静态方法只能访问静态成员
    }
    public void ok() {
        System.out.println(n1);
        say();
        System.out.println(n2);

    }
}
