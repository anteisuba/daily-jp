package 面向对象高级.类变量和类方法;

public class StaticExercise03 {
    public static void main(String[] args) {
        Person02.setTotalPerson(3);
        new Person02();

    }
}
class Person02 {
    private int id;
    private static int total = 0; //3
    public static void setTotalPerson(int total) {
        Person02.total = total;
    }
    public Person02() {
        total++; //3
        id = total;  //4
        System.out.println(total);
    }



}