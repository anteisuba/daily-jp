package 集合.List_;/*
 *@author yang
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        linkedList.remove();  //删除第一个
        System.out.println(linkedList);

        linkedList.set(1,999);

        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        for (Object o :linkedList) {
            System.out.println(o);
        }
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}
