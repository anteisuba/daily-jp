package 面向对象中级.九断点测试;

public class DebugExercise {
    public static void main(String[] args) {
        //创建对象的流程
        //初始化 1 默认初始化 2 显式初始化 3 构造器初始化
        //返回对象地址

        Person yang = new Person("yan", 24);
        System.out.println(yang);
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
