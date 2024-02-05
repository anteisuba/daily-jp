package 面向对象中级.三封装.encap;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account();
        account1.password = "123455";
        account1.name = "yan";
        account1.salary = 40;
        account1.info();
        Account ac = new Account("ac", 60, "223344");
        ac.info();
    }
}

