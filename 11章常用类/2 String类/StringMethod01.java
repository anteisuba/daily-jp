package 常用类.String类;/*
 *@author yang
 */

public class StringMethod01 {
    public static void main(String[] args) {
        //1.equals
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));
        //2.equalsIgnoreCase 忽略大小写的判断内容是否相等
        System.out.println(str1.equalsIgnoreCase(str2));
        //3.length获取字符的个数，字符串的长度
        System.out.println(str1.length());
        //4.indexOf 获取字符在字符串对象中第一次出现的索引，索引从0开始，如果找不到，返回-1
        System.out.println(str1.indexOf("h"));
        //5.lastIndexOf 获取字符在字符串中最后一次出现的索引，引用从0开始，如果找不到，返回-1
        System.out.println(str2.lastIndexOf("o"));
        //6.substring 截取指定范围的子串
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(0,4)); //从0开始截取4个字符

    }
}
