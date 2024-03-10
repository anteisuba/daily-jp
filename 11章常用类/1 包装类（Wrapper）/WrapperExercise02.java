package 常用类.包装类;/*
 *@author yang
 */

public class WrapperExercise02 {
    public void method() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); //不是同一个对象
        //主要看范围，-128 ～ 127 就直接返回,否则就new一个Integer
        Integer m = 1;  //底层Integer.valueOf()
        Integer n = 1;
        System.out.println(m == n); //true，底层一样

        Integer x = 129;
        Integer y = 129;
        System.out.println(x == y);
    }

    public static void main(String[] args) {
        new WrapperExercise02().method();
    }
}
