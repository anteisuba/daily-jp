package 集合.Map_;/*
 *@author yang
 */

import java.util.HashMap;

public class HashMapSource1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java",10);
        map.put("php",20);
        map.put("java",20);
        System.out.println(map);
    }
}
