package 线程;/*
 *@author yang
 */

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //这里不能调用start
        Thread thread = new Thread(dog);
        thread.start();
        //Proxy 代理
    }
}
class Dog implements Runnable { //通过实现Runnable接口，开发线程

    int count = 0;
    @Override
    public void run() {
        while(true) {
            System.out.println("小狗叫" + (++count) + Thread.currentThread().getName());

            //休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (count == 10) {
                break;
            }
        }
    }
}