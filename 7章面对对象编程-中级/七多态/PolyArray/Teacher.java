package 面向对象中级.五多态.PolyArray;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String say() {
        return super.say() + "salary=" + salary;
    }
    //特有方法
    public void teach() {
        System.out.println("老师 " + getName());
    }

}
