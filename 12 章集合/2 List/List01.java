package 集合.List_;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        //1，添加顺序和取出顺序一致，且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("mary");
        System.out.println(list);
        //2.List集合中的每个元素都有其对应的顺序索引，即支持索引
        System.out.println(list.get(1));



    }
}
