package 泛型.Generic;/*
 *@author yang
 */

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        //ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是Dog类型
        //如果编译器发现添加的类型不满足要求 就会报错
        //在遍历的时候，可以直接取出Dog类型，而不是Object类型
        ArrayList<Dog1> arrayList = new ArrayList<Dog1>();
        arrayList.add(new Dog1("wang",10));
        arrayList.add(new Dog1("facai",1));
        arrayList.add(new Dog1("xianhuang",5));
        //arrayList.add(new Cat("zhaocai",8));
        for (Dog1 dog1 :arrayList) {
            System.out.println(dog1.getName()+dog1.getAge());
        }

    }
}
class Dog1 {
    private String name;
    private int age;

    public Dog1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}