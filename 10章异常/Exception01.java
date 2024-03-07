package 异常;/*
 *@author yang
 */

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //程序会抛出异常 ArithmeticException
        //当抛出异常后，程序退出，崩溃，下面的代码就不在运行
        //使用try - catch异常处理机制来解决
        //如果进行异常处理，那么即使出现了异常，程序可以继续执行

        try {
            int res = num1 / num2;
        } catch (Exception e) {
            System.out.println("出现异常的原因是" + e.getMessage());
        }
        System.out.println("程序继续运行。。。");
    }
}
