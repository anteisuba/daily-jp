package 集合.Collection_;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("yan","ji",20.1));
        col.add(new Book("xiaoli","gul",5.1));
        col.add(new Book("hon","caoxue",330.1));

        //使用增强for循环,底层仍然是迭代器
        //快捷方式 I
        for (Object book : col) {
            System.out.println("book =" + book);
        }
        //增强for也可以直接在数组上使用
        int[] nums = {1,8,19,89};
        for (int i : nums) {
            System.out.println(i);
        }
        for (Object o :col) {
            System.out.println(o);
        }


    }
}
