package 面向对象高级.抽象类;

public class AbstractExercise01 {
    public static void main(String[] args) {
        new Manager("yang",123,20000,3000).work();
        new CommonEmployee("jian",222,1000).work();
    }
}

abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}
class Manager extends Employee{
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    private double bonus;

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }

    @Override
    public void work() {
        System.out.println("manager" + getName() + getId() + getSalary() + bonus);
    }
}
class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + getId() + getSalary());
    }
}
