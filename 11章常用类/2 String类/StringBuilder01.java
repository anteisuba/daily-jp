package 常用类.String类;/*
 *@author yang
 */

public class StringBuilder01 {
    public static void main(String[] args) {
        //1.StringBuilder 继承 AbstractStringBuilder类
        //2.实现了 Serializable,说明StringBuilder是可以串行化（该对象可以网络传输，也可以保存到文件）
        //3.StringBuilder是final类，不能被继承
        //4.StringBuilder 对象字符序列仍然是存放在其父类 AbstractStringBuilder 的char[] value;
        //5.StringBuilder 的方法，没有做互斥的处理，即没有synchronized 关键字，因此在单线程的情况下使用

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("yang");
        stringBuilder.insert(0,"jian");
        System.out.println(stringBuilder);
    }
}
