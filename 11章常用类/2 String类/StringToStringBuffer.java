package 常用类.String类;/*
 *@author yang
 */

public class StringToStringBuffer {
    public static void main(String[] args) {
        //使用构造器
        String s = "hello";
        StringBuffer stringBuffer = new StringBuffer(s);

        //使用append方法
        StringBuffer b2 = new StringBuffer();
        b2.append(s);

        //使用toString方法
        StringBuffer b3 = new StringBuffer("yang");
        String s2 = b3.toString();

        //使用构造器
        String s1 = new String(b3);
    }
}
