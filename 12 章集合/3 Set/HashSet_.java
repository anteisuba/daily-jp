package 集合.Set_;/*
 *@author yang
 */

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        //构造器走的源码
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);
    }
}
