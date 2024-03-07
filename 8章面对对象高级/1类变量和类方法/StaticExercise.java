package 面向对象高级.类变量和类方法;

import 面向对象中级.二访问修饰符.hspedu.pkg.Test;

public class StaticExercise {
    static int count = 9;
    public void count() {
        System.out.println("count=" + (count++));
    }

    public static void main(String args[]) {
        new StaticExercise().count();
        new StaticExercise().count();
        System.out.println(StaticExercise.count);

    }


}


