package 面向对象中级.四继承;

/*
 * 讲解继承的本质
 * */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);  //按照查找关系来返回信息
        System.out.println(son.getAge());  //按照查找关系来返回信息
        System.out.println(son.hobby);  //按照查找关系来返回信息
        //首先看子类是否有该属性
        //如果子类有这个属性，并且可以访问，则返回信息
        //如果子类没有这个属性，就看父类有没有这个属性（如果父类有该属性，并且可以访问，就返回信息）
        //如果父类没有就继续向上找
    }
}

class GrandPa {
    String name = "yeye";
    String hobby = "travel";
}

class Father extends GrandPa {
    String name = "baba";
    private int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    String name = "erzi";
}


