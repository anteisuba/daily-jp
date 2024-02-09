package 面向对象中级.六Super;

public class B extends A{

    public B() {
        super("yang");
    }
    public int n1 = 888;
    public void test() {
        System.out.println("super.n1=" + super.n1 );  //100
        super.cal();
    }
    public void hi() {
        System.out.println(super.n1 + super.n2 + super.n3); //无法访问n4

    }

    public void cal() {
        System.out.println("B类的cal方法");
    }

    public void sum() {
        System.out.println("B类的sum方法");
        //调用父类A的cal方法
        //这时，因为子类B没有cal方法，因此
        cal();//先找本类，如果有并且可以调用，则调用，如果没有找父类
        super.cal(); //直接找父类
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }
    public void ook() {
        super.test100();
        super.test200();
        super.test300();
//        super.test400(); 无法访问私有方法


    }

    public static void main(String[] args) {
        B b = new B();
        b.sum();
    }
}
