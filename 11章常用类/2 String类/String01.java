package 常用类.String类;/*
 *@author yang
 */

public class String01 {
    public static void main(String[] args) {
        //1.String 对象用于保存字符串，也就是一组字符序列
        //2.“jack” 字符串变量，双引号括起的字符序列
        //3.String类有很多构造器，实现了构造器重载
        //4.String类实现了接口Serializable[String可以串行化]
        //              接口 Comparable[String可以比较大小]
        //5.String是final类
        //6.String有属性private final char value[];用于存放字符串内容
        //7.注意：value 是一个final类型，不可以修改（地址）

        String name = "jack";
        name = "tom";
        final char[] value = {'s','b','c'};
        char[] v2 = {'t','o','m'};
        value[0] = 'h';  //内容改变是允许

        //value = v2; 错误，不能赋新地址


    }
}
