package 集合.Collection_;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();
        col.add(new Book("yan","ji",20.1));
        col.add(new Book("xiaoli","gul",5.1));
        col.add(new Book("hon","caoxue",330.1));

        System.out.println(col);
        //遍历集合
        //1 先得到col对应的迭代器
        Iterator iterator = col.iterator();
        //2 使用while循环遍历
        while(iterator.hasNext()) { //判断是否还有数据
            //返回下一个元素，类型是Object
            Object next = iterator.next();
            System.out.println("obj" + next);

        }
        //while循环快捷键 itit
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//
//        }
        //3 当退出while循环后，这时iterator迭代器，指向最后的元素
        //iterator.next(); //NoSuchElementException
        //4 如果希望再次遍历，需要充值迭代器
        iterator = col.iterator();
        System.out.println("====第二次遍历====");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }
}

class Book {
    private String name;
    private String autohr;
    private double price;

    public Book(String name, String autohr, double price) {
        this.name = name;
        this.autohr = autohr;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutohr() {
        return autohr;
    }

    public void setAutohr(String autohr) {
        this.autohr = autohr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autohr='" + autohr + '\'' +
                ", price=" + price +
                '}';
    }
}
