package 面向对象中级.五多态.detail;

import 面向对象中级.六Super.B;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        //instanceof 判断对象的类型是否为XX类型或XX类型的子类型
        System.out.println(bb instanceof BB);  //true
        System.out.println(bb instanceof AA);  //true

        AA aa = new BB();
        System.out.println(aa instanceof BB);
        System.out.println(aa instanceof AA);

        Object obj = new Object();
        System.out.println(obj instanceof AA);  //false
        String str = "hello";
        System.out.println(str instanceof Object);  //trued
    }
}

class AA {

}
class BB extends AA {

}
