package 面向对象高级.内部类;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer07 outer07 = new Outer07();
        outer07.m1();

        //外部其他类访问静态内部类
        new Outer07.Inner07().say();

        Outer07.Inner07 inner07 = new Outer07.Inner07();
        inner07.say();

        outer07.getInner07();
    }
}

class Outer07 { //外部类
    private int n1 = 10;
    private static String name = "yang";
    private static void cry() {}
    static class Inner07 { //静态内部类
        public void say() {
            System.out.println(name);
            cry();
        }
    }

    public void m1() {
        Inner07 inner07 = new Inner07();
        inner07.say();
    }

    public Inner07 getInner07() {
        return new Inner07();
    }
}