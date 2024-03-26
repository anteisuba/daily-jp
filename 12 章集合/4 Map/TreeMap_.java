package 集合.Map_;/*
 *@author yang
 */

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {


        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //return ((String)o1).compareTo((String) o2);
                return ((String)o1).length() - ((String)o2).length();
            }
        }); //无序的

        treeMap.put("jack","jie");
        treeMap.put("tom","tang");
        treeMap.put("kristina","keli");
        treeMap.put("smith","simi");
        System.out.println(treeMap);

        treeMap.remove("jack");
        System.out.println(treeMap);

        treeMap.put("smith","yang");
        System.out.println(treeMap);

        System.out.println(treeMap.get("tom"));

    }
}
