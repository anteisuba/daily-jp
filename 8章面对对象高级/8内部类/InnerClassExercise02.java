package 面向对象高级.内部类;

public class InnerClassExercise02 {
    public static void main(String[] args) {
//        f2(new Bell() {
//            @Override
//            public void ring() {
//                System.out.println("起床了");
//            }
//        });
//        f2(new Bell() {
//            @Override
//            public void ring() {
//                System.out.println("上课了");
//            }
//        });
        Cellphone cellphone = new Cellphone();
        cellphone.alarmaclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了");
            }
        });
    }

//    public static void f2(Bell bell) {
//        bell.ring();
//    }
}

interface Bell {
    void ring();
}

class Cellphone {
    public void alarmaclock(Bell bell) { //形参是接口类型
        System.out.println(bell.getClass());
        bell.ring();
    }
}