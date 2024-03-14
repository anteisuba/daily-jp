package 常用类.Arrays类;/*
 *@author yang
 */

import java.util.Arrays;
import java.util.Comparator;

public class ArrayMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1,20,90};
        //遍历用for循环
        System.out.println(Arrays.toString(integers)); //[1,20,90]

        //sort排序
        //可以使用冒泡排序
        //因为数组是引用类型，所以通过sort排序后，会直接影响到实参 arr
        //sort方法是重载的，可以传入一个接口 comparator 实现定制排序
        //定制排序 传入两个参数 1 排序的数组arr 2 实现了Comparator接口的匿名内部类，要求实现compare方法


        Integer arr[] = {1,-1,7,0,89};
        //Arrays.sort(arr); //默认排序方法
        Arrays.sort(arr, new Comparator<Integer>() {  //定制排序方法
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;

            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
