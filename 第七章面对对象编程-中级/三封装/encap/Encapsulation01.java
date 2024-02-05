package 面向对象中级.三封装.encap;

import java.util.Scanner;

public class Encapsulation01 {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("yang");
        person.setAge(10);
        person.setSalary(10000);
        System.out.println(person.info());

        Person yang = new Person("yang", 300, 10000);
        System.out.println(yang.info());
    }
}

class Person {

    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    //有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //可以将set方法写进构造器中,这样才能使用封装的方法
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度不对");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 2 && age < 120) {
            this.age = age;
        } else {
            System.out.println("请输入2-120");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        String pass = "123456";
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入");
        String enterpass = myscanner.next();
        if (enterpass.equals(pass) ) {
            this.salary = salary;
        } else {
            System.out.println("密码错误");
            this.salary = 1;
        }
    }

    public String info() {
        return "信息=" + name + "age=" + age + "salary= " + salary;
     }
}
