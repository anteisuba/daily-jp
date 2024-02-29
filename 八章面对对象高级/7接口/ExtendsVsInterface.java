package 面向对象高级.接口;

import 面向对象中级.五多态.example.Fish;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("wukongt");
        littleMonkey.climbing();
        littleMonkey.swimming();
        littleMonkey.flying();
    }
}
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + " 猴子");
    }
}

//class LittleMonkey extends Monkey {
//    public LittleMonkey(String name) {
//        super(name);
//    }
//
//}

interface Fishable {
    void swimming();
}

interface Birdable {
    void flying();
}

//当子类继承类父类，就自动拥有父类的功能
//如果子类需要扩展，可以通过实现接口的方式扩展
//实现接口是对java单继承机制的补充
class LittleMonkey extends Monkey implements Fishable,Birdable {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习，可以游泳");
    }

    @Override
    public void flying() {
        System.out.println("可以飞翔");
    }
}
