package 常用类.String类;/*
 *@author yang
 */

public class StringExercise05 {
    String str = new String("hsp");
    String str1 = "yang";
    final char[] ch = {'j','a','v','a'};
    public void change(String str1,char ch[]) {
        str1 = "java";
        ch[0] = 'h';
    }
    public static void main(String[] args) {
        StringExercise05 ex = new StringExercise05();
        ex.change(ex.str,ex.ch); //hsp h a v a
        ex.change(ex.str1, ex.ch);
        System.out.println(ex.str1);
        System.out.println(ex.str + "and"); //hspand
        System.out.println(ex.ch);  //hava
    }
}

