package 常用类.String类;/*
 *@author yang
 */

public class StringBuffer01 {
    public static void main(String[] args) {
        //1.StringBuffer的直接父类是AbstractStringBuilder
        //2.StringBuffer实现了Serializable，即StringBuffer的对象可以串行化
        //3.在父类中 AbstractStringBuilder 有属性 char[] value，不是final
        //4.StringBuffer 是一个final类 不能被继承
        StringBuffer stringBuffer = new StringBuffer(); //创造一个大小为16的char[] 用于存放字符内容

        StringBuffer stringBuffer1 = new StringBuffer(100); //capacity 通过构造器指定char[] 大小

        StringBuffer stringBuffer2 = new StringBuffer("string"); //通过给一个String创建StringBuffer，char[] 大小就是 str.length() + 16



    }
}
