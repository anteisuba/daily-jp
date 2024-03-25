package 集合.Map_;/*
 *@author yang
 */

import java.util.*;

public class MapFor {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("deng",new Book("",200));
        hashMap.put("d",new Book("yang",200));
        //map.put("deng","sun");
        hashMap.put("wang","ma");
        hashMap.put("liu",null);
        hashMap.put("liu","huang");
        hashMap.put(null,"guan");
        //第一组：先取出所有的key，通过key取出对应的value ketSet
        Set keySet = hashMap.keySet();
        //增强for
        for (Object key :keySet) {
            System.out.println(key+ "-" + hashMap.get(key));
        }
        // 迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key+ "-" + hashMap.get(key));
        }

        //第二组：把所有的values取出
        System.out.println("=====第二组======");
        Collection values = hashMap.values();
        //这里可以使用所有的Collection使用的遍历方法
        //1 增强for
        for (Object value :values) {
            System.out.println(value);
        }

        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);
        }


        System.out.println("====第三组=====");
        //第三组：通过entrySet来获取
        System.out.println("====增强for====");
        Set entrySet = hashMap.entrySet();
        //增强for
        for (Object entry :entrySet) {
            //将entry转成 Map.Entry
            Map.Entry m =(Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        System.out.println("====迭代器====");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
            //向下转型
            Map.Entry m =(Map.Entry) entry;
            System.out.println(m.getKey()+ "-" + m.getValue());
        }



    }
}
