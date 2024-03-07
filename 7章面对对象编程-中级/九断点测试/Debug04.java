package 面向对象中级.九断点测试;

import java.util.Arrays;

//执行到下一个断点，同时支持动态下断点
public class Debug04 {
    public static void main(String[] args) {
        int[] arr = {1,-1,20,10,100};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }

        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
        System.out.println("hello500");
        System.out.println("hello600");
    }
}
