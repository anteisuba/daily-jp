package 枚举和注解.注解;/*
 *@author yang
 */

public class Homework08 {
    public static void main(String[] args) {
        Color color = Color.BLACK;
        color.show();
        switch (color) {
            //switch中，放入枚举对象
            //在每个case后，直接写上在枚举类中，定义枚举对象即可

            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            default:
                System.out.println("没有匹配到");
        }
        Color color1 = Color.BLUE;

    }
}
enum Color implements AA{
    RED("255","0","0"),
    BLUE("0","0","255"),
    BLACK("0","0","0"),
    YELLOW("255","255","0"),
    GREEN("0","255","0");
    private String redValue;
    private String blueValue;
    private String greenValue;

    Color(String redValue, String blueValue, String greenValue) {
        this.redValue = redValue;
        this.blueValue = blueValue;
        this.greenValue = greenValue;
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue='" + redValue + '\'' +
                ", blueValue='" + blueValue + '\'' +
                ", greenValue='" + greenValue + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("属性值为" + redValue + blueValue + greenValue   );
    }
}

interface AA {
    public void show();
}

