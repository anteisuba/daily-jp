package 面向对象中级.九断点测试;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {1,-1,10,-20,100};
        //Arrays.sort方法底层的实现
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
