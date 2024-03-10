package 异常;/*
 *@author yang
 */

public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在18 ～ 120 之间");

        }
        System.out.println("你的年龄范围正确");
    }
}


//一般情况下，自定义异常是继承RuntimeException
//把自定义异常做成运行时异常，好处是，我们可以使用默认处理机制，比较方便
class AgeException extends RuntimeException { //自定义异常
    public AgeException(String message) {
        super(message);
    }
}