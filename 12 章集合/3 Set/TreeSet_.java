package 集合.Set_;/*
 *@author yang
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        //当使用无参构造器，创建TreeSet时，仍然是无序的
        //添加的元素，按照字符串大小来排列
        //使用TreeSet提供一个构造器，传入一个比较器（匿名内部类）
        //并指定排序规则

  //      TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面 调用String的compareTo方法进行字符串大小比较
                //return ((String)o1).compareTo((String)o2);
                //按照长度大小排序
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");

        System.out.println(treeSet);

    }
}
