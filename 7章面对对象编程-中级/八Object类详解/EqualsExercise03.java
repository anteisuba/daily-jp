package 面向对象中级.八Object类详解;

public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和650f是否相等" + (it == fl));  //true
        char ch1 = 'A';
        char ch2 = 12;
        System.out.println(it == ch1);  //True
        System.out.println(12 == ch2);  //true
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1 和 str2是否相等" + (str1 == str2));  //false

        System.out.println("str1是否equals str2" + (str1.equals(str2)));  //true
    //    System.out.println("hello" == new java.sql.Date());     //false 不是一个类型，编译器报错

    }
}
