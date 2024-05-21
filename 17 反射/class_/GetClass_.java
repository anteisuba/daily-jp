package 反射.class_;/*
 *@author yang
 演示得到Class对象的各种方式

 */

import 反射.Car;

public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        //编译阶段：Class.forName
        String classAllPath = "反射.Car";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);
        //加载阶段：类名.class 应用场景：多用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);

        //运行阶段：对象.getClass 运行类型 应用场景：有对象实例
        Car car = new Car();
        Class<? extends Car> cls3 = car.getClass();
        System.out.println(cls3);

        //通过类加载器来获取到类的Class对象
        //1 先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //2 通过类加载器来得到Class对象
        Class<?> cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //cls1,cls2,cls3,cls4 其实是同一个对象
        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls4);
    }
}
