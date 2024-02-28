package 面向对象高级.接口;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        //IA ia = new IA(); 接口不能被new

    }


}

interface IA {
    void say(); //抽象方法，可以不用abstract
    void hi();
}

class Cat implements IA {
    //一个普通类实现接口，就必须将该接口的所有方法都实现
    //快捷键option + return
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

abstract class Tiger implements IA {
    //抽象类去实现接口时，可以不用实现接口方法

}