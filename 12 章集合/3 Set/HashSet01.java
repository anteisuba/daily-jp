package 集合.Set_;/*
 *@author yang
 */

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("lucy"));
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("jack"));
        System.out.println(hashSet.add("Rose"));
        hashSet.remove("john");
        System.out.println(hashSet);

        hashSet = new HashSet();
        System.out.println(hashSet); //null
        //hashSet不能添加相同的元素 数据
        hashSet.add("lucy"); //ok
        hashSet.add("lucy"); //no
        hashSet.add(new Dog("tom")); //ok
        hashSet.add(new Dog("tom")); //ok
        System.out.println(hashSet);
        hashSet.add(new String("yang")); //ok
        hashSet.add(new String("yang")); //加入不了
        System.out.println(hashSet);
    }
}
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}