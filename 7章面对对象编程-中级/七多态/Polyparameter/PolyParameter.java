package 面向对象中级.五多态.Polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Ordinary ordinary = new Ordinary("yang",2400);
        Managers managers = new Managers("jian", 5000, 10000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(ordinary);
        polyParameter.showEmpAnnual(managers);
        polyParameter.testWork(ordinary);
        polyParameter.testWork(managers);
    }
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual()); //动态绑定机制
    }
    public void testWork(Employee e) {  //Employee e = new Employee();
        if (e instanceof Managers) {
            ((Managers) e).manage();  //向下转型的操作
        } else if (e instanceof Ordinary) {
            ((Ordinary) e).work();   //向下转型的操作
        } else {
            System.out.println("输入错误");
        }
    }
}

