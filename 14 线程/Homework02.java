package 线程;/*
 *@author yang
 */

public class Homework02 {
    public static void main(String[] args) {
        C c = new C();
        Thread thread = new Thread(c);
        thread.setName("t1");
        Thread thread2 = new Thread(c);
        thread2.setName("t2");
        thread.start();
        thread2.start();
    }
}
class C implements Runnable{
    private int money = 10000;
    @Override
    public void run() {

        while (true) {
            //这里使用 synchronized 实现了线程同步
            //当多个线程执行到这里时，就会去争夺 this对象锁
            //哪个线程争夺到this对象锁，就执行synachronized 代码块
            //争夺不到this对象锁，就block，准备继续争夺
            //this对象锁时非公平锁
            synchronized(this) {
                if (money <= 1000) {
                    System.out.println("余额不足");
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取出1000 当前余额= " + money);
            }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }



        }
    }
}
