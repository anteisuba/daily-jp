package 泛型.Generic;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.Comparator;
@SuppressWarnings({"all"})
public class GenericHomework {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",20000,new MyDate(2000,11,11)));
        employees.add(new Employee("jack",12000,new MyDate(2001,12,12)));
        employees.add(new Employee("yang",50000,new MyDate(1999,4,21)));

        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println("==排序后的结果==");
        System.out.println(employees);

    }
}
class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }

        int monthMinus = month - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }

        return day - o.getDay();
    }
}