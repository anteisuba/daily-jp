package 面向对象高级.类变量和类方法;

public class StaticExercise02 {
    public static void main(String[] args) {
        System.out.println("Number of total is" + Person.getTotalPerson());
        Person p1 = new Person();
        System.out.println("Number of total is" + Person.getTotalPerson());
    }
}
class Person {
    private static int id;
    private static int total = 0;
    public static int getTotalPerson() {
        id++;
        return total;
    }
    public Person() {
        total++;
        id = total;
    }

}