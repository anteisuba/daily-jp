package 面向对象高级.抽象类;

public class TestTemplate {
    public static void main(String[] args) {

        Sub sub = new Sub();
        sub.calculateTime();
    }
}

abstract class Template {
    public abstract void job();
    public void calculateTime() {
        long start = System.currentTimeMillis();
        job(); //动态绑定机制
        long end = System.currentTimeMillis();
        System.out.println("AA执行时间 " + (end -start));
    }

}

class Sub extends Template {
    @Override
    public void job() {
        long num = 0;
        for (long i = 0; i < 900000; i++) {
            num += i;
    }
}
}