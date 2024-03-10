package 异常;/*
 *@author yang
 */

public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "杨健";
            int a = Integer.parseInt(str);
            System.out.println("数字" + a);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("异常信息" + e.getMessage());
        } finally {
            System.out.println("都会输出");
        }

        System.out.println("继续执行");
    }

}
