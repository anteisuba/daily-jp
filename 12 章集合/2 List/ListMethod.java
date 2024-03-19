package 集合.List_;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        //void add(int index,Object ele)
        list.add("yan");
        list.add("jian");
        list.add("bao");
        list.add(1,"han"); //如果前面没有加索引，会直接加到最后

        List list2 = new ArrayList();
        list2.add("chang");
        list2.add("il");
        list.add(1,list2);
        System.out.println(list);
        //第一次出现
        System.out.println(list.indexOf("han"));
        //最后一次出现
        System.out.println(list.lastIndexOf("bao"));
        //删除
        list.remove(0);
        System.out.println(list);

        //设置指定index位置的元素为ele，相当于替换
        list.set(1,"mali");
        System.out.println(list);
        //截取
        List reslist = list.subList(0,2);
        System.out.println(reslist);

    }
}
