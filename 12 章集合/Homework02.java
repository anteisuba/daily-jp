package 集合;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {
    public static void main(String[] args) {
        Car car = new Car("bao", 400);
        Car car2 = new Car("bin", 50000);

        ArrayList arrayList = new ArrayList();
        arrayList.add(car);
        arrayList.add(car2);
        arrayList.add(new Car("yang",23));
        arrayList.add("yang");
        arrayList.add("jian");
        //arrayList.remove("yang");
        System.out.println(arrayList.contains("yang"));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.containsAll(arrayList));


        for (Object o :arrayList) {
            System.out.println(o);
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println(arrayList);

    }
}

class Car {
    private String name;
    private int num;

    public Car(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}