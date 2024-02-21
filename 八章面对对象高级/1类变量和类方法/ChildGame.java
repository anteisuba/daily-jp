package 面向对象高级.类变量和类方法;

public class ChildGame {
    public static void main(String[] args) {


        Child child1 = new Child("白骨精");
        child1.join();
        child1.count++;
        //count++;
        Child child2 = new Child("老鼠精");
        child2.join();
        child2.count++;
        //count++;
        Child child3 = new Child("狐狸精");
        child3.join();
        child3.count++;
        //count++;

        System.out.println("共有" + Child.count + "个加入了游戏");
        System.out.println("child1.count=" + child1.count);
        System.out.println("child2.count=" + child2.count);
        System.out.println("child3.count=" + child3.count);



    }
}
class Child {


    private String name;
    //定义一个变量count，是一个类变量（静态变量） static
    //该变量最大的特点就是会被Child类所有对象实例共享
    public static int count = 0;


    public Child(String name) {
        this.name = name;
    }
    public void join() {
        System.out.println(name + "加入了游戏");

    }
}
