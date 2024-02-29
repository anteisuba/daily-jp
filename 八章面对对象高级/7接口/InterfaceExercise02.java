package 面向对象高级.接口;

public class InterfaceExercise02 {
}
interface A2 {
    int x = 0; //public static final
}
class B2 {
    int x = 1;
}
class C2 extends B2 implements A2 {
    public void pX() {
        System.out.println(A2.x + " " + super.x);
    }

    public static void main(String[] args) {
        new C2().pX();
    }
}

