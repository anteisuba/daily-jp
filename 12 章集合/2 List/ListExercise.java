package 集合.List_;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list3 = new Vector();
        list.add("hello");
        list.add("world");
        list.add("now");
        list.add("lets");
        list.add("go");
        list.add("to");
        list.add("java");

        list.add(1,"韩顺平");
        list.remove(3);
        list.set(4,"huanying");
        System.out.println(list.get(3));
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        for (Object o :list) {
            System.out.println(o);
        }

    }
}
