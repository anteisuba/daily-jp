package 常用类.Math类;/*
 *@author yang
 */

public class MathMethod {
    public static void main(String[] args) {
        //1.绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);
        //2.pow 求幂
        double pow = Math.pow(2,4);  //2的4次方
        System.out.println(pow);
        //3.ceil 向上取整
        double ceil = Math.ceil(-3.0001);
        System.out.println(ceil);
        //4.floor 向下取整
        double floor = Math.floor(-4.999);
        System.out.println(floor);
        //5.round 四舍五入
        long round = Math.round(-5.001);
        System.out.println(round);
        //6.sqrt 求开方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);
        //7.random 求随机数
        int a = 2;
        int b = 7;
        System.out.println((int) (a + Math.random() * (b - a + 1)));
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Math.random()); //0<= x < 1
//        }
        //max和min
        int min = Math.min(1,9);
        int max = Math.max(45,99);
        System.out.println(min);
        System.out.println(max);
    }
}
