package 面向对象中级.四继承;
//父类
public class Base extends TopBase{
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public Base() { //无参构造器
        System.out.println("父类无参构造器也被调用");
    }

    public Base(String name,int age) {
        System.out.println("父类的String name,int age被调用");
    }
    //父类提供一个public的方法
    public int getN4() {
        return n4;
    }

    public void test100() {
        System.out.println("test100");
    }
    protected void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    public void call() {
        test400();
    }

}
