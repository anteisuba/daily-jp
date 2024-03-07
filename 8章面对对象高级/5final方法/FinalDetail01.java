package 面向对象高级.final方法;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        new EE().cal();
    }
}

class AA {
    public final double TAX_RATE = 0.9;  //必须赋值
    public final double TAX_RATE2;  //必须赋值
    public final double TAX_RATE3;  //必须赋值


    {
        TAX_RATE3 = 2.2;
    }
    public AA() {
        TAX_RATE2 = 1.1;
    }

}

class BB {
    public static final double TAX_RATE = 1.1;
    public static final double TAX_RATE2;
    //public static final double TAX_RATE3;
    static {
        TAX_RATE2 = 12.2;
    }
    public BB() {
        //TAX_RATE3 = 3.3;
    }

}

final class CC {


}
class DD {
    public final void cal() {
        System.out.println("cal");
    }
}

class EE extends DD {

}