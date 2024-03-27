package 泛型.Generic;/*
 *@author yang
 */

import java.util.*;

public class GenericExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Student student1 = new Student("yang",24);
        Student student2 = new Student("jian",23);
        Student student3 = new Student("hua",34);
        HashSet<Student> student = new HashSet<Student>();
        student.add(student1);
        student.add(student2);
        student.add(student3);
        for (Student student4 :student) {
            System.out.println(student4);
        }

        HashMap<String, Student> hm = new HashMap<>();
        hm.put("tom",student1);
        hm.put("jian",student2);
        hm.put("hua",student3);
//        for (Student student5 : hm.values()) {
//            System.out.println(student5);
//        }
        System.out.println("===========");
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next);
        }


    }
}
class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}