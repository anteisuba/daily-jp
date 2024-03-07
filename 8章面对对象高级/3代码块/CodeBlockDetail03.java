package 面向对象高级.代码块;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB(); //AAA的普通代码块  AAA构造器 BBB普通代码块 BBB构造器
    }
}

class AAA {
    {
        System.out.println("AAA的普通代码块");
    }
    public AAA() {
        //super()
        //调用本类的普通代码块
        System.out.println("AAA（）构造器被调用");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB的普通代码块");
    }
    public BBB() {
        //super()
        //调用本类的普通代码块
        System.out.println("BBB（）构造器被调用");
    }
}