package 常用类.包装类;/*
 *@author yang
 */

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类-String
        Integer i = 100; // 自动装箱
        //方法1
        String str1 = i + "";
        //方法2
        String str2 = i.toString();
        //方法3
        String str3 = String.valueOf(i);

        //String-Integer
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);
        Integer i3 = new Integer(str4);

    }
}
