package 常用类.String类;/*
 *@author yang
 */

public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";
        //1 先创建一个StringBuilder sb = StringBuilder()
        //2 执行 sb.append("hello")
        //3 sb.append("abc")
        //4 String s = sb.toString
        //最终c指向堆中的一个对象（String）value - 池中的"helloabc"

        String c = a + b;
        String d = "helloabc";
        System.out.println(c == d);
    }
}
