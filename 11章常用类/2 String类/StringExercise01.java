package 常用类.String类;/*
 *@author yang
 */

public class StringExercise01 {
    public static void main(String[] args) {
        String a = "hsp";
        String b = new String("hsp");
        System.out.println(a.equals(b));  //T
        System.out.println(a == b);  //F
        //b.intern返回的是常量池的地址
        System.out.println(a == b.intern());  //T
        System.out.println(b == b.intern());  //F

    }
}
