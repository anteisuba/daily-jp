package 面向对象中级.五多态.objectpoly;

public class PloyObject {
    public static void main(String[] args) {
        //体验对象多态的特点
        //编译类型是Animal ，运行类型是Dog
        Animal animal = new Dog();
        animal.cry();

        //编译类型是animal，运行类型是Cat
        animal = new Cat();
        animal.cry();

    }
}

