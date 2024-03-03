package 面向对象高级.内部类;
/*
* 演示匿名内部类的使用，基于接口
*
* */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04 {
    private int n1 = 10;
    public void method() {
//        class B implements A {
//
//            @Override
//            public void cry() {
//                System.out.println("老虎叫");
//            }
//        }
//        B b = new B();
//        b.cry();
        //tiger的编译类型 A接口类型
        //tiger的运行类型 匿名内部类
        //XXXX = Outer04$1
        /*
        * 底层会分配类名 Outer04
        * class XXXX implements A {
        *   @Override
        *   public void cry() {
        *       System.out.println("老虎叫")
        *   }
        * }
        * */
        //tiger的编译类型 A接口类型
        //tiger的运行类型 匿名内部类
        //jdk底层在创建匿名内部类Outer04$1，立即马上创建了Outer04$1实例，并把地址返回给tiger
        A tiger = new A() {  //基于接口的匿名内部类
            @Override
            public void cry() {
                System.out.println("老虎叫");
            }
        };
        System.out.println("tiger的运行类型" + tiger.getClass());
        tiger.cry();

        //基于类的匿名内部类
        //Father的编译类型 Father
        //Father的运行类型 匿名内部类Outer04$2
        //底层会创建匿名内部类
        /*
        * class Outer04$2 extends Father {
        *
        * }
        * */
        //同时也直接返回了匿名内部类Outer04$2的对象
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        father.test();

        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("基于静态类的匿名内部类");
            }
        };
        animal.eat();
    }




}

interface A {
    public void cry();
}

class Father {
    public Father(String name) {

    }
    public void test() {

    }
}

abstract class Animal {
    abstract void eat();
}
