package 泛型.customgeneric;/*
 *@author yang
 */
/*
* 在接口中，静态不能使用泛型
*
* */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

interface IUsb<U,R> {
    R get(U u);
    //U name = "yang";
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);

    //在jdk8中，可以在接口中，使用默认方法，也可以使用泛型
    default R method(U u) {
        return null;
    }
}

interface IA extends IUsb<String,Double> {

}




//当我们实现IA接口时，因为IA在继承IUsu接口时，指定了U为String R为Double
//在实现IUsb方法时，使用String替换U，Double替换R
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

//实现接口时，直接指定泛型接口的类型
//U指定了Integer，R指定了Float
//所以当实现IUsb方法时，会使用Integer替换U，使用Float替换R
//没有指定类型，默认Object
class BB implements IUsb<Integer,Float> {

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }

    @Override
    public Float method(Integer integer) {
        return IUsb.super.method(integer);
    }
}

class CC implements IUsb<Object,Object> {

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}