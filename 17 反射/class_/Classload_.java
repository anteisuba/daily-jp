package 反射.class_;/*
 *@author yang
 */

import 反射.Car;
import 反射.Cat;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Classload_ {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入key");
        String key = scanner.next();
        switch(key) {
            case "1":
//                Cat cat = new Cat(); //静态加载
//                cat.cry();
                break;
            case "2":
                Class<?> cls = Class.forName("反射.Cat"); //加载Person类
                Object o = cls.newInstance();
                Method m = cls.getMethod("cry");
                m.invoke(o);
                break;
            default:
                System.out.println("do nothing");

        }
    }
}

//因为new Cat() 是静态加载，因此必须编写Cat
//Car类是动态加载，所以，没有编写Person类也不会报错，只有当动态加载该类时，才会报错
