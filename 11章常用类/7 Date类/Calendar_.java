package 常用类.Date_;/*
 *@author yang
 */

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        //Calendar 是一个抽象类，并且构造器是private
        //可以通过getInstance()来获取实例
        //提供大量的方法和字段提供给程序员

        Calendar c = Calendar.getInstance();  //创建日历类对象
        System.out.println(c);
        //获取日历对象的某个日历字段
        System.out.println("年：" + c.get(Calendar.YEAR));
        System.out.println("月：" + (c.get(Calendar.MONTH) + 1));
        System.out.println("日：" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时：" + c.get(Calendar.HOUR));
        System.out.println("分钟：" + c.get(Calendar.MINUTE));
        System.out.println("秒：" + c.get(Calendar.SECOND));

    }
}
