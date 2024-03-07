package 面向对象高级.代码块;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //创建对象实例时（new）
        //AA aa = new AA();
        //创建子类对象实例，父类也会被加载,先加载父类，再加载子类
        //AA aa1 = new AA();
        //使用类的静态成员时（静态属性，静态方法0）
        //System.out.println(Cat.n1);
        //static只会被执行一次
        //DD dd = new DD();
       // DD dd1 = new DD();

        //普通代码块，在new对象时，被调用，而且是每创建一个对象，就被调用一次
        //普通代码块是构造器的补充
        System.out.println(DD.n1);
        //new DD();

    }
}

class DD {
    public static int n1 = 333;
    static {
        System.out.println("DD的静态代码被执行");
    }
    {
        System.out.println("DD的普通代码块");
    }
}

class Animal {
    static {
        System.out.println("Animal的静态代码1被执行");
    }
}
class Cat extends Animal{
    public static int n1 = 999;
    static {
        System.out.println("Cat的静态代码被执行");
    }
}
class BB {
    static {
        System.out.println("BB的静态代码块被执行");
    }
}
class AA extends BB{
    static {
        System.out.println("AA的静态代码块被执行");
    }
}
