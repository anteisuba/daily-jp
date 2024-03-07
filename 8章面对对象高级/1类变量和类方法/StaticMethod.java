package 面向对象高级.类变量和类方法;

public class StaticMethod {
    public static void main(String[] args) {
        Stu stu = new Stu("yang");
        stu.payFee(100);
        Stu stu1 = new Stu("marry");
        stu1.payFee(200);
        Stu.payFee(400);
        System.out.println("9开平方结果是=" + Math.sqrt(9));
        Stu.showFee();
        MyTools.calSum(3,4);
    }
}

class MyTools {
    public static double calSum(double n1 ,double n2) {
        return n1 + n2;
    }
}

class Stu {
    private String name;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //静态方法，静态方法可以访问静态属性
    public static void payFee(double fee) {
        Stu.fee += fee;
    }
    //静态方法，静态方法可以访问静态属性
    public static void showFee() {
        System.out.println("总学费有：" + Stu.fee);

    }

}

