package 面向对象高级.内部类;

public class LocallnnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("Outer02的哈希=" + outer02.hashCode());
    }
}

class Outer02 { //外部类
    private int n1 = 100;
    private void m2() {
        System.out.println("Outer02 m2()");
    }

    public void m1() {
        //局部内部类是定义在外部类的局部位置，用常在方法中
        //内部类的作用范围：仅仅在定义它的方法或代码块中
        final class Inner02 {  //局部内部类,不能添加访问修饰符，可以添加final，添加后不能被继承
            //可以只直接访问外部类的所有成员，包括私有的
            private int n1 = 800;  //就近原则输出800
            public void f1() {
                //局部内部类可以直接访问外部类的成员，比如外部类n1和m2


                //Outer02.this本质就是外部类的对象，即哪个对象调用了m1，Outer02.this就是哪个对象
                System.out.println("n1 = " + n1 + "外部类的n1 =" +Outer02.this.n1);
                System.out.println("Outer02.this" + Outer02.this.hashCode());
                m2();
            }
        }
        //外部类在方法中，可以创建Inner02对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();

        {//代码块中的局部内部类
            class Inner03 {

            }
        }
    }
}

