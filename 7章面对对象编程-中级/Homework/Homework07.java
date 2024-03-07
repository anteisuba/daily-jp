package 面向对象中级.homework;

public class Homework07 {
    public static void main(String[] args) {
//        CheckingAcconut checkingAcconut = new CheckingAcconut(1000);
//        checkingAcconut.deposit(10);  //1009
//        checkingAcconut.withdraw(9);
//        System.out.println(checkingAcconut.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyIntereset();
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100); //免手续费
        System.out.println(savingsAccount.getBalance());

    }
}
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    //存款
    public void deposit(double amount) {
        balance += amount;
    }
    //取款
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class CheckingAcconut extends BankAccount{
    public CheckingAcconut(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) { //重写存款方法
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
class SavingsAccount extends BankAccount{
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    private int count = 3;
    private double rate = 0.01;
    public void earnMonthlyIntereset() {
        count = 3;
        super.deposit(getBalance() * rate);
    }

    @Override
    public void deposit(double amount) {
        //判断是否可以免手续费
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.deposit(amount + 1);
        }

        count--;
    }
}