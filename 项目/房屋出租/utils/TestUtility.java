package 项目.房屋出租.utils;

public class TestUtility {
    public static void main(String[] args) {
//        String s = Utility.readString(3);
//        System.out.println("s=" + s);

        String s2 = Utility.readString(10, "hspedu");
        System.out.println("s2=" + s2);
        //当一个方法是static时，就是一个静态方法
        //静态方法可以直接通过类名调用
    }
}
