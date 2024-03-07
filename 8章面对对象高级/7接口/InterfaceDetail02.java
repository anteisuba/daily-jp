package 面向对象高级.接口;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.a); //静态特征，直接访问，不用new
        //IB.b = 20;  不能重新赋值，说明是final的
    }
}

interface IB {
    int a = 10;
    public static final int b = 20;

    void hi();
}
interface IC {
    void say();
}
//接口可以继承接口
interface ID extends IB,IC {

}
//接口的修饰只能是public和默认
interface IE {

}
//一个类可以同时实现多个接口
class Pig implements IB,IC {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}
