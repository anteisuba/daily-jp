package 面向对象高级.main方法;

public class Main01 {

    //静态的变量或属性
    private static String name = "yang";
    private int n1 = 1000;
    private static void hi() {
        System.out.println("main01的hi方法");
    }

    private void cry() {
        System.out.println("main01的cry方法");
    }

    public static void main(String[] args) {
        //可以直接使用name，可以访问本类的静态成员
        System.out.println("name =" + name);
        hi();
        //静态方法main不可以访问本类的非静态成员
       // System.out.println("n1=" + n1);
       // cry();
        Main01 main01 = new Main01();
        main01.cry();
        System.out.println(main01.n1);
        System.out.println(Main01.name);

    }
}
