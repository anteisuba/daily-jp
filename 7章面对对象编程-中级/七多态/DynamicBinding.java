package 面向对象中级.五多态;

public class DynamicBinding {
    public static void main(String[] args) {
        //编译类型A，运行类型B
        A1 a = new B1();
        System.out.println(a.sum());  //40 -- 30
        System.out.println(a.sum1());  //30 -- 20
    }
}
class A1 {
    public int i = 10;
    //动态绑定
    public int sum() {
        return getI() + 10;  //动态绑定，方法调用运行类型，子类B
    }
    public int sum1() {  //动态绑定属性，哪里调用，哪里使用
        return i + 10;
    }
    public int getI() {
        return i;
    }

}
class B1 extends A1{
    public int i = 20;
//    public int sum() {
//        return i + 20;
//    }
    public int getI() {
        return i;
    }
//    public int sum1() {
//        return i + 10;
//    }
}
