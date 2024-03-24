package 集合.Map_;/*
 *@author yang
 */

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"all"})
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","yang");
        map.put("no2","jian");
        map.put("no1","hua"); //替换机制，当有相同的key时，就等价于替换
        map.put("no3","jian"); //k-v
        map.put(null,null);
        map.put(null,"abc"); //等价替换
        map.put("no4",null);
        map.put("no5",null);
        map.put(1,"zhao");
        map.put(new Object(),"zhao");

        System.out.println(map);
        System.out.println(map.get("no2")); //通过get方法传入一个key会返回对应的value

    }
}
