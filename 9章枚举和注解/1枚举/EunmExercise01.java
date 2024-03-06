package 枚举和注解.自定义类实现枚举;/*
 *@author yang
 */

public class EunmExercise01 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy2 = Gender.GIRL;

        System.out.println(boy);
        System.out.println(boy2 == boy);

    }
}

enum Gender {
    BOY,GIRL;
}
