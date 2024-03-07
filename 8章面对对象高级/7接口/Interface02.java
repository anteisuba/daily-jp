package 面向对象高级.接口;

public class Interface02 {

}

class A implements Interface {
    @Override
    public void hi() {
        System.out.println("实现接口，需要将该接口的抽象方法都实现");
    }
}
interface Interface {
    //属性
    public int n1 = 10;
    //方法
    //在接口中，抽象方法可以省略abstract关键字

    public void hi();
    //在JDK8后，可以有默认实现方法,但是需要使用default关键字
    default public void ok() {
        System.out.println("ok");
    }
    //在JDK8后，可以有静态方法
    public static void cry() {
        System.out.println("cry...");
    }
}