package 面向对象高级.final方法;

public class final01 {
    public static void main(String[] args) {
        E e = new E();
        //e.TAX_RATE = 0.09;
    }
}

//要求A类不能被其他类继承
final class A {

}

//class B extends A {
//    不能继承
//}

class C {
    //hi不能被子类重写
    public final void hi() {

    }
}

class D extends C {
//    @Override
//    public void hi() {
//        System.out.println("重写了C类的hi方法");
//    }
}

class E {
    //当不希望类的某个属性的值被修改
    public final double TAX_RATE = 0.08;

}

class F {
    public void cry() {
        final double NUM = 0.01; //局部变量
        //NUM = 0.9;  不能修改
        System.out.println(NUM);
    }
}