package 泛型.Generic;/*
 *@author yang
 */

import java.util.Arrays;

public class CustomeGeneric {
    public static void main(String[] args) {
        //T = Double,R String,M Integer
        Tiger<Double, String, Integer> g = new Tiger<>("john");
        g.setT(12.3);
        g.setR("yang");
        g.setM(12);
        Tiger g2 = new Tiger("jo"); //ok T = Object,R = Object,M = Objcet
        g2.setT("yang");
        System.out.println(g);
        System.out.println(g2);


    }
}

//Tiger后面泛型，所以把Tiger称为自定义泛型类
//T，R，M 泛型的标识符，一般是单个大写字母，泛型的标识符可以有多个
//普通成员可以使用泛型（属性，方法）
//使用泛型的数组，不能初始化，因为数组在new不能确定T类型，就无法在内存开空间
//静态方法中不能使用类的泛型



class Tiger<T,R,M> {
    String name;
    R r;
    M m;
    T t;
    T[] ts;

    public Tiger(String name) {
        this.name = name;
    }

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    //public static void m1(M m) {}  不允许使用静态，因为静态是和类相关的，在类加载时，对象还没有创建
    //static R r2;                   如果静态方法和静态属性使用了泛型，JVM就无法完成初始化

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) { //方法使用到泛型
        this.r = r;
    }

    public M getM() { //返回类型可以使用泛型
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                ", ts=" + Arrays.toString(ts) +
                '}';
    }
}