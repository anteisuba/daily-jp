package 反射.class_;/*
 *@author yang
 对Class类特点梳理
 */

import 反射.Cat;

public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class也是类，因此也继承Object类
        //2.Class类对象不是new出来的，而是系统创建的
        //传统new对象
        Cat cat = new Cat();
        //反射方式
        Class cls1 = Class.forName("反射.Cat");
        Class cls2 = Class.forName("反射.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
    }


}
