package 枚举和注解.注解;/*
 *@author yang
 */

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1);
        a.hi();
    }
}


//1 @Deprecated 修饰某个元素，表示该元素已经过时了
//2 即不推荐使用，但是仍可以使用
@Deprecated
class A {
    public int n1 = 10;
    public void hi() {

    }
}