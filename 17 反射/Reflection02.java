package 反射;/*
 *@author yang
 测试反射调用的性能，和优化方案
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        m1();
        m2();

    }
    //传统方法调用
    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法来调用m1耗时" + (end - start));
    }
    //反射机制调用方法m1
    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("反射.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true); //反射调用方法时，取消访问检查
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法来调用m2耗时" + (end - start));


    }
}
