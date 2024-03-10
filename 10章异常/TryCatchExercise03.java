package 异常;/*
 *@author yang
 */

public class TryCatchExercise03 {
    public static int method() {
        int i = 1;
        try {
            i++;  //2
            String[] names = new String[3];
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (java.lang.NullPointerException e) {
            return ++i;  // 3=>temp 临时变量
        } finally {
            ++i; //4
            System.out.println("i=" + i); //4
        }
    }
    public static void main(String[] args) {
        System.out.println(method());  //返回临时变量3
    }
}
