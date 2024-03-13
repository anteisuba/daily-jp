package 常用类.String类;/*
 *@author yang
 */

public class StringMethod02 {
    public static void main(String[] args) {
        //1.toUpperCase转换成大写
        String s = "hellO";
        System.out.println(s.toUpperCase());
        //2.toLowerCase转换成小写
        System.out.println(s.toLowerCase());
        //3.concat拼接字符串
        String s1 = "yang";
        System.out.println(s.concat(s1));
        //4.replace 替换字符串中的字符,s1.replace()方法执行后返回的结果才是替换过的结果，本身对s1没有影响
        System.out.println(s1.replace("yang","jian"));
        //5.split  ，对于某些分割字符，我们需要转义 | \\等
        String str2 = "yang,jian,wang,shi,xuan";
        String[] split = str2.split(","); //分割成数组
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //6.toCharArray 转换成字符数组
        s = "happy";
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        //7.compareTo比较两个字符串的大小，如果前者大，则返回正数，后者大，则返回负数
        String a = "jchn";
        String b = "jack";
        System.out.println(a.compareTo(b));
        //8.farmat格式字符串
        /*
        * 占位符有：
        * %s 表示后面有字符串来替换
        * %c 使用char来替换
        * %d 是整数来替换
        * %.2f 使用小数来替换，替换后只保留两位
        * */
        String name = "john";
        int age = 10;
        double score = 98.3 /3;
        char gender = '男';
        String info =
                "我的姓名是" + name + "年龄是" + age + "成绩是" + score + "性别是" + gender;
        System.out.println(info);
        String formatStr = "我的姓名是%s 年龄是%d,成绩是%.2f 性别是%c ";
        String info2 = String.format(formatStr,name,age,score,gender);
        System.out.println(info2);
    }
}
