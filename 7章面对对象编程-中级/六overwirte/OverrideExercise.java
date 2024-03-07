package 面向对象中级.七overwirte;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("yang",24);
        System.out.println(person.say());
        Student student = new Student("jian",30,"id",90);
        System.out.println(student.say());
    }
}

class Person {
    private String name;
    private int age;
    public Person() {

    }
    public Person(String name,int age) {
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

    public String say() {
        return "my name=" + name + "my age =" + age;
    }

}

class Student extends Person{
    private String id;
    private double score;
    public Student() {

    }

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String id, double score) {
        this.id = id;
        this.score = score;
    }
    public String say() {
        return super.say() + "id=" + id + "score =" + score;
    }
}