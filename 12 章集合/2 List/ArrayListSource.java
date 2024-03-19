package 集合.List_;/*
 *@author yang
 */

import java.util.ArrayList;

public class ArrayListSource {


    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //使用无参构造器创建ArrayList对象
        ArrayList list = new ArrayList(8);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
