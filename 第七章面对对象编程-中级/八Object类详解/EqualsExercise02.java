package 面向对象中级.八Object类详解;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.name = "yang";

        Person1 person2 = new Person1();
        person2.name = "yang";

        System.out.println(person1 == person2);  //false
        System.out.println(person1.name.equals(person2.name));  //true
        System.out.println(person1.equals(person2));  //false,没有重写euqals,重写后为true

        String s1 = new String("yang");
        String s2 = new String("yang");
        System.out.println(s1.equals(s2));  //true 字符串被重写了
        System.out.println(s1 == s2);       //false  不是同一个对象
    }
}
class Person1 {
    public String name;
    public Person1() {

    }
    public Person1(String name) {
        this.name = name;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person1) {
            Person1 p1 =(Person1)obj;
            return this.name.equals(p1.name);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}