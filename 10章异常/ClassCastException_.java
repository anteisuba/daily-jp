package 异常;/*
 *@author yang
 */

public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B(); //向上转型
        B b2 =(B)b; //向下转型
        C c2 =(C)b; //这里会抛出
    }
}

class A{}
class B extends A{}
class C extends A{}
