package 异常;/*
 *@author yang
 */

public class TryCatchDetail02 {
    public static void main(String[] args) {
        //如果try代码块有可能有多个异常
        //可以使用多个catch分别捕获不同的异常，相应处理
        //子类异常写在前面，父类异常要写在后面
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } catch(java.lang.NullPointerException e) {
            System.out.println("空指针异常=" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("数学异常" + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class Person {
    private String name;
    public String getName() {
        return name;
    }
}
