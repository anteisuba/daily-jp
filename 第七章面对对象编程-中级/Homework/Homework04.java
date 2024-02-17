package 面向对象中级.homework;

import org.w3c.dom.ls.LSOutput;

public class Homework04 {
    public static void main(String[] args) {
        Worker worker = new Worker(100000);
        worker.xinxi();
    }
}
class Yuan {
    public Yuan() {
    }

    private double salary;


    public Yuan(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void xinxi() {
        System.out.println("工资是" + salary);
    }
}
class Worker extends Yuan{
    public Worker(double salary) {
        super(salary);
    }

    @Override
    public void xinxi() {
        super.xinxi();
        System.out.println("工人" + getSalary());
    }
}
class Peasant extends Yuan{
    public Peasant(double salary) {
        super(salary);
    }
    public void xinxi() {
        System.out.println("农民" + getSalary());
    }
}
class Teach extends Yuan{
    private double kechou;
    private int day;

    public Teach(double salary, double kechou,int day) {
        super(salary);
        this.kechou = kechou;
        this.day = day;
    }

    public double getKechou() {
        return kechou;
    }

    public void setKechou(double kechou) {
        this.kechou = kechou;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void xinxi() {
        System.out.println("教师=" + getKechou() * getDay() + getSalary());
    }
}
class Scientist extends Yuan{
    private int bones;

    public Scientist(double salary, int bones) {
        super(salary);
        this.bones = bones;
    }

    public int getBones() {
        return bones;
    }

    public void setBones(int bones) {
        this.bones = bones;
    }

    public void xinxi() {
        System.out.println("教授=" + getSalary() + getBones());
    }
}
class Waiter extends Yuan{
    public Waiter(double salary) {
        super(salary);
    }
    public void xinxi() {
        System.out.println("服务生" + getSalary());
    }
}