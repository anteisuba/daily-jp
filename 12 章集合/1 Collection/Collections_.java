package 集合.Collection_;/*
 *@author yang
 */

import java.util.*;

public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");

        //反转list中的元素
        Collections.reverse(list);
        System.out.println(list);
        //shuffle 随机排序
        Collections.shuffle(list);
        System.out.println(list);
        //sort 自然排序
        Collections.sort(list);
        System.out.println(list);
        //长度大小排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println(list);

        //元素交换
        Collections.swap(list,0,1);
        System.out.println(list);
        
    }
}
