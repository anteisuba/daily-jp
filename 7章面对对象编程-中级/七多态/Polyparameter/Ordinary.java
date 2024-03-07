package 面向对象中级.五多态.Polyparameter;

public class Ordinary extends Employee{
    public Ordinary(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通员工" + getName() + "is working");
    }


    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
