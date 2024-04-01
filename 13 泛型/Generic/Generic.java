package 泛型.Generic;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //ok
        //ArrayList<int> list1 = new ArrayList<int>(); //错误
        ArrayList<A> al1 = new ArrayList<A>();
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig1 = new Pig<A>(new B()); //可以传入其子类
        aPig1.f();

        //泛型的使用形式
        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        //简写
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        ArrayList<Pig> pigs = new ArrayList<>();
        //泛型默认是Object

    }
}

class A {}
class B extends A{}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
    public void f() {
        System.out.println(e.getClass());
    }
}