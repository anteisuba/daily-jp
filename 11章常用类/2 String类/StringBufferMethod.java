package 常用类.String类;/*
 *@author yang
 */

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        s.append(",");
        s.append("yang").append(true).append(10.6);
        System.out.println(s);

        //删除1-4但不包括4
        s.delete(1,4);
        System.out.println(s);

        s.replace(4,7,"jian");
        System.out.println(s);

        s.insert(5,"hua");
        System.out.println(s);


        System.out.println(s.indexOf("j"));

        System.out.println(s.length());
    }
}
