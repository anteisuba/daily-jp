package 面向对象高级.单例模式;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        System.out.println(GirlFriend.n1);
    }
}

//
class GirlFriend {
    private String name;

    public static int n1 = 100;
    //饿汉式可能造成创建了却没有使用
    private static GirlFriend gf = new GirlFriend("yang");
    //只能创建一个 GirlFriend对象
    //单利模式 - 饿汉式
    //1.将构造器私有化
    //2.类的内部创建对象 （该对象是static）
    //3.提供一个公共的static方法 返回gf对象

    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
