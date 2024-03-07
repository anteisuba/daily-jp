package 面向对象中级.homework;

public class Homework03 {
    public static void main(String[] args) {
        Jingli jingli = new Jingli("yang",200,10,1.2);
        jingli.dayin();
        Putong putong = new Putong("jian",100,20,1);
        putong.dayin();
    }
}

class Yuangong {
    private String name;
    private double salary;
    private int day;
    private double grade;

    public Yuangong() {
    }

    public Yuangong(String name, double salary, int day, double grade) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void dayin() {
        System.out.println("工资是=" + salary);
    }

}
class Jingli extends Yuangong{
    public Jingli(String name, double salary, int day, double grade) {
        super(name, salary, day, grade);
    }

    public void dayin() {
        System.out.println("经理工资为" + (1000 + getSalary() * getDay() * getGrade()));
    }
}
class Putong extends Yuangong{
    public Putong(String name, double salary, int day, double grade) {
        super(name, salary, day, grade);
    }

    public void dayin() {
        System.out.println("普通员工工资为=" + getSalary() * getDay() * getGrade());
    }
}
