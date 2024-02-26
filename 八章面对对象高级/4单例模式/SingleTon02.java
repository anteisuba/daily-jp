package 面向对象高级.单例模式;

public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);
    }
}

class Cat {
    private String name;
    private static Cat cat;



    //1 创造构造器私有化
    //2 定义一个static静态属性对象
    //3 提供一个public的static方法，可以返回一个Cat对象
    //4 懒汉式 只有当用户使用getInstance时，才返回cat对象，后面再次调用时，会返回上次创建的cat对象
    private Cat(String name) {
        System.out.println("構造调用");
        this.name = name;

    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("yang");
        }
        return cat;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
