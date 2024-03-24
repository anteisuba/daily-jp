package 集合.Set_;/*
 *@author yang
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        //Set接口实现类的对象（Set接口对象），不能存放重复的元素，可以添加一个null
        //set接口的实现类的对象，不能存放重复的元素，可以添加一个null
        //set接口对象存放数据是无序的（添加的顺序和取出的顺序不一致）
        //
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        for (Object o :set) {
            System.out.println(o);
        }

        System.out.println("=======");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        
    }
}
