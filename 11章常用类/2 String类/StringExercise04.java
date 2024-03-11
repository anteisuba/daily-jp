package 常用类.String类;/*
 *@author yang
 */

public class StringExercise04 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        String s2 = "java";
        String s5 = "hspedujava";
        String s6 = (s1 + s2).intern(); //返回常量池
        System.out.println(s5 == s6);  //T
        System.out.println(s5.equals(s6)); //T


    }
}
