package 集合.Map_;/*
 *@author yang
 */

import java.util.HashMap;
import java.util.Objects;

public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i < 12; i++) {
            hashMap.put(new A(i),"hello");

        }
    }
}
class A {
    private int num;

    public A(int num) {
        this.num = num;
    }


    //所有A对象的hashCode都是100
    @Override
    public int hashCode() {
        return 100;
    }
}