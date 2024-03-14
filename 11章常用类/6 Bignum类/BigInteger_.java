package 常用类.Bignum类;/*
 *@author yang
 */

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        java.math.BigInteger bigInteger = new java.math.BigInteger("1233333342342424");
        java.math.BigInteger bigInteger1 = new java.math.BigInteger("10444444444456000000");
        //在对BigInteger进行加减乘除的时候，需要使用对应的方法
        BigInteger add = bigInteger.add(bigInteger1); //加
        bigInteger.subtract(bigInteger1); //减
        bigInteger.multiply(bigInteger1); //乘
        bigInteger.divide(bigInteger1); //除

        System.out.println("l=" + bigInteger);
        System.out.println(add);
    }
}
