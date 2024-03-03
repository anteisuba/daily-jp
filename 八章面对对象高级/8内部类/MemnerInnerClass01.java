package 面向对象高级.内部类;

public class MemnerInnerClass01 {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        outer06.t1();

        //外部其他类使用成员内部类的三种方式
        //Outer.Inner
        //outer.new
        Outer06.Inner01 inner01 = outer06.new Inner01();
        inner01.say();
        //第二种方式,在外部类中编写一个方法
        Outer06.Inner01 inner01Instace = outer06.getInner01Instance();

        inner01Instace.say();

        outer06.getInner01Instance();



    }
}
class Outer06 {
    private int n1 = 10;
    public String name = "zhangsan";
    private void hell() {
        System.out.println("hello");
    }
    public class Inner01 { //成员内部类，没有放在方法，或代码块中
        private int n1 = 66;
        public void say() {
            System.out.println("outer 的 n1" + n1  + Outer06.this.n1+ "outer 的 name " + name);
            hell();
        }


    }
    //方法返回一个Inner01的实例
    public Inner01 getInner01Instance() {
        return new Inner01();
    }

    public void t1() {

        //使用成员内部类
        Inner01 inner01 = new Inner01();
        inner01.say();
    }
}
