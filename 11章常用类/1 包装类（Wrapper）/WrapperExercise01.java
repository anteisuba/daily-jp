package 常用类.包装类;/*
 *@author yang
 */

public class WrapperExercise01 {
    public static void main(String[] args) {
        Double d = 100d; //自动装箱 Double.valueOf(100d)
        Float f = 1.5f; //自动装箱 Float.valueOf(1.5f)
        Object obj1 = true ? new Integer(1) : new Double(2.0); //三元运算符
        System.out.println(obj1); //1.0而不是1
        Object obj2;
        if (true) {
            obj2 = new Integer(1);
        } else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);


    }
}
