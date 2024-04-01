package 泛型.customgeneric;/*
 *@author yang
 */

import 面向对象中级.七overwirte.Dog;

public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);   //Integer
        apple.fly(new Dog1());
    }
}
class Apple<T,R,M> {
    public<E> void fly(E e) {
        System.out.println(e.getClass().getSimpleName());
    }
    //public<U> void eat(U u) {} //错误
    public void run(M m) {}
}

class Dog1 {}