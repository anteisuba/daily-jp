package 面向对象高级.内部类;

public class AnonymouslnnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        System.out.println(outer05.hashCode());

    }
}
class Outer05 {
    private int n1 = 99;
    public void f1() {
        //不能添加访问修饰符
        Person p = new Person() {
            private int n1 = 88;  //重名遵循就近原则
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法" + n1 + Outer05.this.n1);
                System.out.println(Outer05.this.hashCode());
            }

        };
        p.hi(); //动态绑定，运行类型是Outer05&1

        // 也可以直接调用，匿名内部类本身也是返回对象
        //class匿名内部类extends Person {}
        new Person() {
            @Override
            public void hi() {
                System.out.println("直接调用匿名内部类");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("yang");
    }

}

class Person {
    public void hi() {
        System.out.println("person hi()");
    }
    public void ok(String str) {
        System.out.println("Person ok" + str);
    }
}
