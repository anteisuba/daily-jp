package 面向对象中级.四继承;

/*
 * 讲解继承的本质
 * */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son(); 
    }
}

class GrandPa {
    String name = "yeye";
    String hobby = "travel";
}

class Father extends GrandPa {
    String name = "baba";
    int age = 39;
}

class Son extends Father {
    String name = "erzi";
}


