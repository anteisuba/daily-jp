package 枚举和注解.自定义类实现枚举;

public class Enumeration01 {
    public static void main(String[] args) {
        Season spring = new Season("春天", "温暖");
        Season winter = new Season("冬天", "clod");
        Season summer = new Season("夏天", "hot");
        Season autumen = new Season("秋天", "凉爽");
        //体现季节是固定的四个对象，只读，不需要修改
        //枚举类：即把具体对象一个一个列举出来的类，称为枚举类

        Season other = new Season("红天", "～～～～");
    }
}
class Season {
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}