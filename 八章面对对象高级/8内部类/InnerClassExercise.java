package 面向对象高级.内部类;

import 面向对象中级.二访问修饰符.hspedu.pkg.Test;

public class InnerClassExercise {
    public static void main(String[] args) {
        Test11 t = new Test11();
        Test11.Inner r = t.new Inner();
        System.out.println(r.a);
    }
}


class Test11 {
    public Test11() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }
    class Inner {
        public int a = 5;
    }

}
