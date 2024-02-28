package 面向对象高级.final方法;

public class FinalExercise02 {
    public static void main(String[] args) {

    }
}
class Something {
    public int addOne(final int x) {
        //++x;  不能修改final x的值
        return x + 1;
    }
}
