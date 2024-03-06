package 枚举和注解.注解;/*
 *@author yang
 */

public class Homework05 {
    public static void main(String[] args) {
        new A1("jian").show();
    }
}

class A1 {
    private String name;

    public A1(String name) {
        this.name = name;
    }

    public void show() {
        class B {
            private final String name;

            B(String name) {
                this.name = name;
            }
        }
        B b = new B("yang");
        System.out.println(b.name + A1.this.name);

    }
}