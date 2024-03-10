package 异常;/*
 *@author yang
 */

public class Homework02 {
    public static void main(String[] args) {
        if (args[4].equals("john")) {
            System.out.println("AA");
        } else {
            System.out.println("BB");
        }
        Object o = args[2]; //Stirng -> Object,向上转型
        String i = (String) o; //向下转型成Integer，错误，发生类型转换错误ClassCastException
    }
}
