package 面向对象中级.四继承;

import java.util.Scanner;

//子类
public class Sub extends Base{


    public Sub() { //无参构造器
        super(); //默认调用父类的无参构造器，super必须放在第一行
        System.out.println("子类无参构造器被调用");
    }

    public Sub(String name) {
        super("tom",30);  //用super去指定父类的哪一个构造器
        System.out.println("子类的String name被调用");
        Scanner myscanner = new Scanner(System.in);
        name = myscanner.next();
    }

    public Sub(String name,int age) {
        super();
        System.out.println("子类的String name,int age被调用");
    }

    public void sayOk() {
        System.out.println(n1 + n2 + n3 ); //无法使用private n4
        test100();
        test200();
        test300();
        //无法使用test400
        System.out.println(getN4()); //可以访问私有属性n4
        call();

    }

    public static void main(String[] args) {

    }
}
