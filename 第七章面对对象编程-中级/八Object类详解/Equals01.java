package 面向对象中级.八Object类详解;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);  //true
        System.out.println(b == c);  //true
        B obj = a;
        System.out.println(obj == c);
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);
        "hello".equals("abc");
        Integer integer1 = new Integer(1000);  //Integer类的构造函数已经被标记为过时，并且计划在将来的某个版本将其移除
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);  //false
        System.out.println(integer1.equals(integer2));  //true

        String str1 = new String("hspedu");
        String str2 = new String("hspedu");
        System.out.println(str1 == str2);   //不是同一个对象 false
        System.out.println(str1.equals(str2));  //false

    }
}
class B {

}

class A extends B{

}

