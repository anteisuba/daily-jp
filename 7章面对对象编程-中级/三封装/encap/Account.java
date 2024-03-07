package 面向对象中级.三封装.encap;

public class Account {
    String name;
    double salary;
    String password;
    public Account() {

    }
    public Account(String name,double balance,String password) {
        this.setName(name);
        this.setSalary(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >=2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("name的长度2到4位");
            this.name = "yang";
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 20) {
            this.salary = salary;
        } else {
            System.out.println("余额必须大于20");
            this.salary = 30;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("password必须是6位");
            this.password = "123456";
        }
    }

    public void info() {
        System.out.println("name=" + name + "salary=" + salary + "password" + password);
    }

    public static void main(String[] args) {

    }
}
