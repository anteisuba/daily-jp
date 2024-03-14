package 常用类.Arrays类;/*
 *@author yang
 */

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("jin",90);
        books[2] = new Book("qing",3);
        books[3] = new Book("java",300);

        //按照价格从大到小排序
//        Arrays.sort(books, new java.util.Comparator<Book>() {
//            //这里对Book数组排序， 因此o1 和 o2就是Book对象
//            @Override
//            public int compare(Book o1, Book o2) {
//                Book book1 = (Book)o1;
//                Book book2 = (Book)o2;
//                double priceVal = book2.getPrice() - book1.getPrice();
//                //转换
//                if (priceVal > 0) {
//                    return -1;
//                } else if (priceVal < 0) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });

        Arrays.sort(books, new java.util.Comparator<Book>() {
            //这里对Book数组排序， 因此o1 和 o2就是Book对象
            @Override
            public int compare(Book o1, Book o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                //书名的长度来排序
                return book2.getName().length() - book1.getName().length();
            }
        });

        System.out.println(Arrays.toString(books));
    }
}
class Book{
    private String name;
    private double price;

    public Book() {
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
