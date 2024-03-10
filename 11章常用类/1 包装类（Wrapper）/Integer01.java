package 常用类.包装类;/*
 *@author yang
 */

public class Integer01 {

    public static void main(String[] args) {
        //手动装箱
        int n1 = 100;
        //Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        int i = integer1.intValue();

        //自动装箱
        int n2 = 200;
        Integer integer2 = n2; //底层使用的是 Integer,valueOf(n2)
        //自动拆箱
        int n3 = integer2; //底层使用的是intValue()方法


    }
}
