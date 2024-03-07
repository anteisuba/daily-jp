package 面向对象高级.内部类;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new AA() {
            @Override
            public void cry() {
                System.out.println("这是AA");
            }
        });
        f1(new BB());
    }
    //静态方法，形参是接口类型
    public static void f1(AA aa) {
        aa.cry();
    }

}

interface AA {
    public void cry();
}

class BB implements AA{
    @Override
    public void cry() {
        System.out.println("硬编码");
    }
}
