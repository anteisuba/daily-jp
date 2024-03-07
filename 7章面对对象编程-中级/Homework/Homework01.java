package 面向对象中级.homework;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("jack",10,"java");
        persons[1] = new Person("tom",50,"dashuju");
        persons[2] = new Person("marry",30,"PHP");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]); //默认对象，toString

        }

        //使用冒泡排序

        Person temp = null;
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[i].getName().length() > persons[i+1].getName().length()) {
                   temp = persons[i];
                   persons[i] = persons[i+1];
                   persons[i+1] = temp;
                }
            }
        }

        System.out.println("排序后的效果");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

    }
}
class Person {
    private String name;
    private int age;
    private String job;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}