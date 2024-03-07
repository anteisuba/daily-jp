package 面向对象中级.八Object类详解;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("yang", 10, 'm');
        Person person2 = new Person("yang", 10, 'm');
        System.out.println(person1.equals(person2));  //false,new了两次，不是一个对象
        //equals重写后 返回true

    }
}
class Person {
    private String name;
    private int age;
    private char gender;

    //重写Object 的equals方法
    public boolean equals(Object obj) {
        //判断比较的两个对象是同一个对象，则直接返回true
        if(this == obj) {
            return true;
        }
        //类型判断
        if (obj instanceof Person) {
            //进行类型转换，向下转型
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}