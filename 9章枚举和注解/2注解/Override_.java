package 枚举和注解.注解;/*
 *@author yang
 */

public class Override_ {
    public static void main(String[] args) {
        Son son = new Son();
        son.fly();

        Father father = new Father();
        father.fly();
    }
}

class Father {
    public void fly() {
        System.out.println("Father fly");
    }
}
class Son extends Father {

    //如果写了Override，编译器就会检查该方法是否真的重写了父类的方法
    //如果重写了，则编译通过，如果没有重写，则编译错误
    @Override   //表示子类重写了父类的fly方法
    public void fly() {
        System.out.println("Son fly");
    }
}