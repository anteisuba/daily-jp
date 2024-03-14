package 常用类.Arrays类;/*
 *@author yang
 */

import java.util.Arrays;
import java.util.List;

public class ArrayMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,90,123,442};
        //binarySearch通过二分搜索进行查找，要求必须排好
        //1,使用binarySearch 二叉查找
        //2.要求该数组是有序的
        //3.数组不存在该元素，返回-（low+1）
        int index = Arrays.binarySearch(arr,123);
        System.out.println(index);

        //copyOf 数组元素复制
        //1.从arr数组中，拷贝arr.length个元素到newArr数组中
        //2.如果拷贝的长度 > Arraynews 就在新数组后面增加null
        Integer[] newArr = Arrays.copyOf(arr,arr.length + 1);
        System.out.println(Arrays.toString(newArr));

        //ill 数组元素的填充
        Integer[] num = new Integer[]{9,3,2};
        //1.是用99去填充num数组，可以理解成是替换原理的元素
        Arrays.fill(num,99);
        System.out.println("num数组填充后");
        System.out.println(Arrays.toString(num));

        //equals 比较两个数组元素内容是否完全一致
        Integer[] arr2 = {1,2,90,123,442};
        boolean equals = Arrays.equals(arr,arr2);
        System.out.println(equals);

        //1.aslist方法，会将（2，3，4，5，6，1）数据转成一个List集合
        //2.返回的asList 编译类型 List（接口）
        //3.asList的运行类型 java.util.Arrays$ArrayList
        List aslist = Arrays.asList(2,3,4,5,6,1);
        System.out.println(aslist);
        System.out.println("aslist的运行类型");
        System.out.println(aslist.getClass());

    }
}
