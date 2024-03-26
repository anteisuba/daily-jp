package 集合.Collection_;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smitwerrrh");
        list.add("king33rr");
        list.add("mielan");
        System.out.println("自然顺序的最大元素"+ Collections.max(list));
        Object maxobject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println(maxobject);

        //返回指定集合中指定元素的出现次数
        System.out.println("tom出现的次数"+Collections.frequency(list,"tom"));

        //将src中的内容复制到dest中
        ArrayList dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
            
        }
        Collections.copy(dest,list);
        System.out.println(dest);

        //替换
        Collections.replaceAll(list,"tom","yang");
        System.out.println(list);
    }
}
