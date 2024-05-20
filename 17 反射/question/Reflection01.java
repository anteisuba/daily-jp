package 反射.question;/*
 *@author yang
 */

import 反射.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream(""));
        Object classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method" + methodName);

        //2.创建对象，传统的方法行不通=》使用反射机制
        //new classfullpath();

        //3.使用反射机制解决
        //（1）加载类,返回Class类型的对象cls
        Class cls = Class.forName((String) classfullpath);
        //(2)通过cls得到加载的类     的对象实例
        Cat o = (Cat) cls.newInstance();
        //(3)通过 cls 得到你加载的类 com.hesedu.Cat 的 methodName 的方法对象
        Method method1 = cls.getMethod(methodName);
        //（4）通过method1 调用方法：即通过方法对象来实现调用方法
        System.out.println("============== ");
        method1.invoke(o);

        //Field getField不能是私有属性
        Field name = cls.getField("name");
        System.out.println(name.get(o));

        //Constructor
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);

        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);
    }
}
