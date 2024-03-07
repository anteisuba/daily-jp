package 面向对象中级.homework;

public class Homework05 {
    public static void main(String[] args) {

    }
}

class Grand {
    String name = "AA";
    private int age = 100;
    public void g1() {

    }
}
class Father extends Grand {
    String id = "001";
    private double score;
    public void f1() {
        //super.name g1()
        //this.id score f1() name g1()
    }


}
class Son extends Father {
    String name = "BB";
    public void g1() {

    }
    private void show() {
        //super.name id g1() f1()
        //this.name g1() id f1()
    }

}