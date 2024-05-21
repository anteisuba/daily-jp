package 反射;/*
 *@author yang
 演示通过反射调用方法
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //得到Boss类对应的Class对象
        Class<?> bossCls = Class.forName("反射.Boss");
        //创建对象
        Object o = bossCls.newInstance();
        //调用public的hi方法
        //Method hi = bossCls.getMethod("hi", String.class);
        Method hi = bossCls.getDeclaredMethod("hi",String.class);
        hi.invoke(o,"hanshun");

        Method say = bossCls.getDeclaredMethod("say", int.class,String.class, char.class);
        say.setAccessible(true);
        say.invoke(o,100,"zhangsan",'男');

        //在反射中，如果方法有返回值，统一返回Object
        Object returnVal = say.invoke(null, 300, "wangwu", "n");
        System.out.println(returnVal);

    }
}

class Boss {
    public int age;
    private static String name;

    public Boss() {}
    private static String say(int n,String s,char c) {
        return n + " " + s + " " + c;
    }

    public void hi(String s) {
        System.out.println("hi " + s);
    }
}
