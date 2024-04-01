package 泛型.customgeneric;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("xx");

        //List<Object> list = new ArrayList<String>();  泛型没有继承性

        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<A> list3 = new ArrayList<>();
        ArrayList<B> list4 = new ArrayList<>();
        ArrayList<C> list5 = new ArrayList<>();

        printCollection1(list1); //List<?> 表示任意的泛型类型都可以接受
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);


        //printCollection2(list1);
        //printCollection2(list2);
        printCollection2(list3);  //List<? extends A> 表示上限，可以接受A或者A子类
        printCollection2(list4);
        printCollection2(list5);

        printCollection3(list1); //List<? super A> 支持A类以及A类的父类，不限于直接父类
        //printCollection3(list2);
        printCollection3(list3);
        //printCollection3(list4);
        //printCollection3(list5);

    }
    //List<?> 表示任意的泛型类型都可以接受
    public static void printCollection1(List<?> c) {
        for (Object object : c) {
            System.out.println(object);
        }

    }
    //List<? extends A> 表示上限，可以接受A或者A子类
    public static void printCollection2(List<? extends A> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    //List<? super A> 支持A类以及A类的父类，不限于直接父类
    public static void printCollection3(List<? super A> c) {
        for (Object object : c) {
            System.out.println(object);
        }

    }
}
class A {

}

class B extends A {

}

class C extends B {

}