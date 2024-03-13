package 常用类.String类;/*
 *@author yang
 */

public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);  //null通过appendNull返回成了数组
        System.out.println(sb.length()); //4

        System.out.println(sb); //null
        StringBuffer sb1 = new StringBuffer(str); //null对象
        System.out.println(sb1);//NullPointException
    }
}
