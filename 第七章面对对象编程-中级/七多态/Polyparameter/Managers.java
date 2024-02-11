package 面向对象中级.五多态.Polyparameter;

public class Managers extends Employee{
    private int bonus;

    public Managers(String name, double salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void manage() {
        System.out.println("经理" + getName() + "is working");
    }
    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
