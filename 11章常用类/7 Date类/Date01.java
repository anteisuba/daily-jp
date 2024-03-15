package 常用类.Date_;/*
 *@author yang
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        Date d2 = new Date(9234567);
        System.out.println(d1.getTime());

        //创建 SimpleDateFormat对象，可以指定相应的格式
        //这里的格式使用的字母是规定好，不能乱写
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前日期=" + format);

        //可以把一个格式化的String 转成对应的Date
        //得到的Date 仍然是在输出时，还是按照国外的形式
        //String s = "1996年01月01日 10:20:30 星期一";
       // Date parse = sdf.parse(s);
       //ar System.out.println(parse);


    }
}
