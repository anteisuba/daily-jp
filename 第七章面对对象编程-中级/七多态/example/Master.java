package 面向对象中级.五多态.example;

import 面向对象中级.五多态.example.Bone;
import 面向对象中级.五多态.example.Dog;
import 面向对象中级.五多态.example.Animal;

public class Master {
    private String name;

    public Master(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //主任给小狗喂骨头
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("主人" + name + dog.getName() + "吃" + bone.getName());
//    }
    //animal编译类型是Animal。指向Animal子类的对象
    //food编译类型是Food，指向Food子类的对象

    public void feed(Animal animal,Food food) {
        System.out.println("主人" + name + animal.getName() + "吃" + food.getName());
    }


}
