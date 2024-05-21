package 反射;/*
 *@author yang
 通过反射机制创建实例
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //先获取到User类的Class对象
        Class<?> usercls = Class.forName("反射.User");
        //通过public的无参构造器创建实例
        Object o = usercls.newInstance();
        System.out.println(o);
        //通过public的有参构造器创建实例
        /*
        * constructor对象就是
        * public User(String name) {
            this.name = name;
        }
        * */
        //3.1 先得到对应构造器
        Constructor<?> constructor = usercls.getConstructor(String.class);
        //3.2 创建实例，并传入实参
        Object yan = constructor.newInstance("yang");
        System.out.println(yan);
        //通过非public的有参构造器创建实例
        Constructor<?> constructor1 = usercls.getDeclaredConstructor(int.class, String.class);
        constructor1.setAccessible(true);  //爆破，使用反射可以访问私有的构造器
        Object user2 = constructor1.newInstance(100, "zhang");

    }
}


class User {
    private int age = 10;
    private String name = "yang";
    public User() {}

    public User(String name) {
        this.name = name;
    }
    private User(int age,String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "User [age=" + age + ",name" + name + "]";
    }

}
