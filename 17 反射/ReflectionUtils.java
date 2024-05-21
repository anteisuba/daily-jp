package 反射;/*
 *@author yang
 */

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> personCls = Class.forName("反射.Person");
        System.out.println(personCls.getName());

        System.out.println(personCls.getSimpleName());

        Field[] fields = personCls.getFields();
        for (Field field : fields) { //增强for
            System.out.println("本类及父类的属性=" +field.getName());
        }

        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类所有属性=" + declaredField);
        }

        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println("本类以及父类的方法" + method.getName());
        }

        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类所有方法" + declaredMethod.getName());
        }

        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类及父类的构造器" + constructor.getName());
        }




    }

    //第一组
    @Test
    public void api_01() {

    }
}

class A {
    public String hobby;
    public A() {}
    public void hi() {

    }
}


class Person extends A{
    public String name;
    protected int age;
    String job;
    private double sal;

    public Person() {}
    public Person(String name) {}
    public void m1() {

    }

    protected void m2() {

    }

    void m3() {

    }

    private void m4() {

    }
}