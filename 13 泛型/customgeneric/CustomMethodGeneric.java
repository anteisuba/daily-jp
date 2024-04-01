package 泛型.customgeneric;/*
 *@author yang
 */

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("String s",123);
        System.out.println("=====");
        car.fly(400,2.1);

        Fish<String,Integer> fish = new Fish<>();
        fish.hello(21,"yang");
    }
}

class Car { //普通类
    public void run() { //普通方法

    }

    //<Y,R>就是泛型
    //提供给fly方法使用的
    public<T,R> void fly(T t,R r) { //泛型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }

}

class Fish<T , R> {  //泛型类

    public void run() { //普通方法

    }
    public<U,M> void eat(U u,M m) {  //泛型方法


    }

    //hi方法不是泛型方法
    public void hi(T t) { //hi方法使用了类定义的泛型

    }
    //泛型方法可以使用类声明的泛型，也可以使用自己声明的泛型
    public<K> void hello(R r,K k) {
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}