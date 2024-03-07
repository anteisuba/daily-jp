package 面向对象中级.homework;

public class Homework10 {
    public static void main(String[] args) {
        Person1 p = new Student(); //父类指向子类 向上转型

        p.eat();
        p.run();
        Student student = (Student) p; //子类 子类 子类 父类对象 向下转型
        student.run();
        student.eat();
        student.study();


    }

}
class Person1 {
    public void run() {
        System.out.println("person run");
    }
    public void eat() {
        System.out.println("person eat");
    }
}
class Student extends Person1 {
    @Override
    public void run() {
        System.out.println("student run");
    }

    public void study() {
        System.out.println("studeny study");
    }
}
