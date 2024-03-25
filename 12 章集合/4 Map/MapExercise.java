package 集合.Map_;/*
 *@author yang
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1,new Emp("yang",233334,1));
        hashMap.put(2,new Emp("jian",2344466,2));
        hashMap.put(3,new Emp("hua",433,3));

        Set keySet = hashMap.keySet();
        System.out.println("====第一种遍历方式====");
        for (Object key :keySet) {
            //先获取value
            Emp emp = (Emp) hashMap.get(key);
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
        System.out.println("====第二种遍历方式====");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();

            Emp emp = (Emp) hashMap.get(key);
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }

        System.out.println("====第三种遍历方式====");
        Set entrySet = hashMap.entrySet();
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            Emp emp = (Emp) m.getValue();
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }

        System.out.println("====第四种遍历方式====");
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry entry =(Map.Entry)iterator1.next();
            //通过entry去的value；
            Emp emp = (Emp) entry.getValue();
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }

        }


    }
}

class Emp {
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
