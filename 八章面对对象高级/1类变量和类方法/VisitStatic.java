package 面向对象高级.类变量和类方法;

public class VisitStatic {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.name);
        System.out.println(A.name);
    }
}

class A {
    //类变量访问必须遵守相关的访问权限
    public static String name = "yang";
    private int num = 10;
}
