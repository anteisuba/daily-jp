package 反射;/*
 *@author yang
 演示反射操作属性
 */

import java.lang.reflect.Field;

public class ReflecAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 得到Student类对应的Class对象
        Class<?> stuClass = Class.forName("反射.Student");
        // 创建对象
        Object o = stuClass.newInstance(); //o的运行类型是Student
        System.out.println(o.getClass()); //Student
        //使用反射得到age属性对象
        Field age = stuClass.getField("age");
        age.set(o,88); //通过反射来操作属性
        System.out.println(o);
        // 使用反射操作name
        Field name = stuClass.getDeclaredField("name");
        //对name进行爆破
        name.setAccessible(true);
        name.set(o,"jian");  //因为name是static属性，因此o也可以写出null
        System.out.println(o);


    }
}

class Student {
    public int age;
    private static String name;
    public Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age + name +
                '}';
    }
}
