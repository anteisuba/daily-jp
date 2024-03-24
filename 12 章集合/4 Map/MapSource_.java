package 集合.Map_;/*
 *@author yang
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","yang");
        map.put("no2","zhang");

        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj : set) {
            //System.out.println(entry.getClass());
            //为了从HashMap$Node 取出k-v
            //1 向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue() );
        }
    }
}
