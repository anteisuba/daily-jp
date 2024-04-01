package 泛型.Generic;/*
 *@author yang
 */

public class Generic03 {
    public static void main(String[] args) {
        Person<Integer> integerPerson = new Person<Integer>(100);
        Person<String> stringPerson = new Person<String>("jian");
        stringPerson.t();
    }
}
class Person<E> {
    E s; //E表示s的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型

    public Person(E s) {
        this.s = s;
    }
    public E f() {
        return s;
    }
    public void t() {
        System.out.println(s.getClass()); //显示s的运行类型
    }
}
