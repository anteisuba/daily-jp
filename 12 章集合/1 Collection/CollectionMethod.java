package 集合;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //add
        List list = new ArrayList();
        list.add("jack");
        list.add(100); //list.add(new Integer(100))
        list.add(true);
        System.out.println("list=" + list);
        //remove
        //list.remove(0); //删除第一个元素
        list.remove("jack"); //指定删除某个元素
        System.out.println(list);

        //contains 查找元素是否存在
        if (list.contains("jack")) {
            System.out.println("cunzai");
        } else {
            System.out.println("bucunzai");
        }
        System.out.println(list.contains(100));

        //size 元素的个数
        System.out.println(list.size());

        //isEmpty 是否为空
        System.out.println(list.isEmpty());

        //clear 清空
        //list.clear();
        //System.out.println(list);

        //addAll 添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("yang");
        list2.add("jian");
        list.addAll(list2);
        System.out.println(list);

        //removeALl 删除多个元素
        list.add("hua");
        list.removeAll(list2);
        System.out.println(list);

    }
}
