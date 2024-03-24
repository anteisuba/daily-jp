package 集合.Map_;/*
 *@author yang
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("deng",new Book("",200));
        map.put("d",new Book("yang",200));
        //map.put("deng","sun");
        map.put("wang","ma");
        map.put("liu",null);
        map.put("liu","huang");
        map.put(null,"guan");
        System.out.println(map);

        map.remove(null);
        System.out.println(map);
        System.out.println(map.get("wang"));
        System.out.println("k-v" + map.size());
        System.out.println(map.isEmpty());
        //clear 清除k-v
        //map.clear();
        System.out.println(map);
        System.out.println(map.containsKey("liu"));
    }
}
class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }



    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}