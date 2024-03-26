package 集合;/*
 *@author yang
 */

import java.util.*;

public class Homework03 {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("yang",12200);
        hashMap.put("jack",650);
        hashMap.put("tom",3900);

        hashMap.put("jack",2600);
        Collection values = hashMap.values();
        Set set = hashMap.keySet();
        for (Object key : set) {
            hashMap.put(key, (Integer)hashMap.get(key) + 100);
        }


        for (Object o : hashMap.entrySet()) {
            System.out.println(o);

        }
        Iterator iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println(values);

        System.out.println(hashMap);

    }
}
