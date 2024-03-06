package 枚举和注解.自定义类实现枚举;/*
 *@author yang
 */

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season02.AUTUMN);
        System.out.println(Season02.SPRING);
    }
}

//演示自定义枚举
class Season02 {
    private String name;
    private String desc;

    public static final Season02 SPRING = new Season02("spring","温暖");
    public static final Season02 WINTER = new Season02("冬天", "clod");
    public static final Season02 AUTUMN = new Season02("秋天", "凉爽");
    public static final Season02 SUMMER = new Season02("夏天", "hot");

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    //1将构造器私有化 防止被new
    //2去掉set相关方法，防止属性被修改
    //3在Season内部，直接创建规定的对象
    //4优化，可以加入final修饰符

    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }



    public String getDesc() {
        return desc;
    }


}