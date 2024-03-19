package 集合.List_;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("yan",24,"jian"));
        list.add(new Book("ji",32,"hua"));
        list.add(new Book("hua",43,"wei"));

        System.out.println(list);
        for (Object o :list) {
            System.out.println(o);
        }


    }
    public static void sort(List list) {

        int listsize = list.size();
        for (int i = 0; i < listsize - 1; i++) {
            for (int j = 0; j < listsize - 1 - i; j++) {
                Book boo1 = (Book)list.get(j);
                Book boo2 = (Book)list.get(j + 1);
                if (boo1.getSalary() > boo2.getSalary()) {
                    list.set(j,boo2);
                    list.set(j + 1,boo1);
                }

            }
        }
    }
}

class Book {
    private String name;
    private double salary;
    private String anthor;

    public Book(String name, double salary, String anthor) {
        this.name = name;
        this.salary = salary;
        this.anthor = anthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAnthor() {
        return anthor;
    }

    public void setAnthor(String anthor) {
        this.anthor = anthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", anthor='" + anthor + '\'' +
                '}';
    }
    
    
}