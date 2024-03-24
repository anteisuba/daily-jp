package 集合.Set_;/*
 *@author yang
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSource {
    public static void main(String[] args) {
        //1 加入顺序是有序的
        //2 LinkedHashSet底层维护的是一个LinkedHashMap（HashMap的子类）
        //3 inkedHashSet底层结构（数组table+双向链表）
        //4 添加第一次时，直接将数组table扩容到 16 ，存放的结点类型是 LinkedHashMap$Entry
        //5 数组是 HashMap$Node[] 存放的元素/数据是 LinkedHashMap$Entry类型


        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456); //no
        set.add(new Customer("liu",1001));
        set.add(123);
        set.add("yang");
        System.out.println(set);

    }
}

class Customer {
    private String name;
    private int num;

    public Customer(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}