package 面向对象中级.五多态.detail;

public class PolyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();
        animal.eat();
//        animal.catchMouse();无法调用子类特有成员
//        在编译阶段，能调用哪些成员，是由编译类型决定的
        animal.run();
        animal.show();
        animal.sleep();
        //最终运行效果看子类的具体实现，即调用方法时，按照从子类开始查找方法
        //调用与方法调用规则一致。

        //多态的向下转型
        //cat的编译类型Cat，运行类型是Cat
        Cat cat = (Cat) animal;
        //父类的引用必须是当前目标类型的对象
        cat.catchMouse();
        // Dog dog =(Dog)animal; 不可以,animal指向cat
        Dog dog = (Dog)animal1;
        dog.cry();

    }
}
