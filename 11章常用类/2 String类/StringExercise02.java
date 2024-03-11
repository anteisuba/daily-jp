package 常用类.String类;/*
 *@author yang
 */

public class StringExercise02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "hspedu";  //常量 hspedu
        Person p2 = new Person();
        p2.name = "hspedu"; //常量 hspedu

        System.out.println(p1.name.equals(p2.name)); //T
        System.out.println(p1.name == p2.name);  //T
        System.out.println(p1.name == "hspedu"); //T

        String s1 = new String("bcde"); //
        String s2 = new String("bcde");
        System.out.println(s1 == s2); //F
    }
}

class Person {
    String name;
}