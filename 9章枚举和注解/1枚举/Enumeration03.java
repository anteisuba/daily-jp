package 枚举和注解.自定义类实现枚举;/*
 *@author yang
 */

public class Enumeration03 {
    public static void main(String[] args) {

        System.out.println(Season03.SPRING);
        System.out.println(Season03.WINTER);
        System.out.println(Season03.WHAT);
    }
}
enum Season03 {


    SPRING("春天","温暖"),
    WINTER("冬天","cold"),
    WHAT;

    private String name;
    private String desc;

    Season03() {
        System.out.println("无参构造器被调用");
    }

    Season03(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season03{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
