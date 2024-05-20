package 反射.question;/*
 *@author yang
 */

import 反射.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
@SuppressWarnings({"all"})
public class ReflectionQuestion {
    //根据配置文件 re.properties 指定信息，创建Cat对象并调用方法m1
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //传统方式
        Cat cat = new Cat();
        cat.hi();
        //1.使用Properties类，可以读写配置文件
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
        method1.invoke(o); //传统方法 对象.方法()
                           //反射机制 方法.invoke(对象)





    }
}
