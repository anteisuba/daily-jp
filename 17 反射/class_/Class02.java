package 反射.class_;/*
 *@author yang
 Class类的常用方法
 */

import 反射.Car;

import java.lang.reflect.Field;

public class Class02 {

    //获取Car类的对应的Class对象
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath = "反射.Car";
        //<?> 表示不确定的java类型
        Class<?> cls = Class.forName(classAllPath);
        //输出cls
        System.out.println(cls); //显示cls对象，是那个类的Class对象
        System.out.println(cls.getClass()); //输出运行类型

        //得到包名
        System.out.println(cls.getPackage().getName());

        //类名
        System.out.println(cls.getName());
        //通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        System.out.println(car); //car.toString
        //通过反射获取属性
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        //通过反射给属性赋值
        brand.set(car,"奔驰");
        System.out.println(brand.get(car));
        //遍历所有的属性
        System.out.println("===所有的字段属性===");
        Field[] fields = cls.getFields();
        for(Field f : fields) {
            System.out.println(f.getName()); //属性字段的各个名称
        }
    }
}
