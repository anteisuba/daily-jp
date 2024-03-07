package 面向对象中级.五多态;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long)d;
        System.out.println(l);
        int in = 5;
//        boolean b = (boolean)in;  //boolean -> int
        Object obj = "hello";         //向上转型
        String objStr = (String)obj;  //向下转型
        System.out.println(objStr);   //hello

        Object objPri = new Integer(5); //向上转型
//        String str = (String)objPri;  //不可以 指向Integer的父类引用转成String
        Integer str1 = (Integer)objPri;
    }
}


