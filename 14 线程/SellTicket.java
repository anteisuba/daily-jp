package 线程;/*
 *@author yang
 */

public class SellTicket {
    public static void main(String[] args) {
//        SellTicket02 ticket01 = new SellTicket02();
//        SellTicket02 ticket02 = new SellTicket02();
//        SellTicket02 ticket03 = new SellTicket02();
//        Thread thread1 = new Thread(ticket01);
//        Thread thread2 = new Thread(ticket02);
//        Thread thread3 = new Thread(ticket03);
//
//        //这里会出现票数超卖的问题
//        thread1.start();
//        thread2.start();
//        thread3.start();
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();

    }
}

//实现接口方式，使用synchronzed实现线程同步
class SellTicket03 implements Runnable {

    private static int ticketNum = 50; //让多个线程共享ticketNum
    private boolean loop = true; //控制run方法变量，
    Object object = new Object();


    //同步方法（静态的）的锁为当前本身
    //public synchronized static void m1() 锁是加在 SellTicket0.class
    public synchronized static void m1() {

    }

    public static void m2() {
        synchronized(SellTicket03.class) {
            System.out.println("m2");
        }
    }


    //public synchronized void sell() 就是一个同步方法
    //这时锁在this对象
    //也可以在代码块砂锅写synachronize,同步代码块
    public /*synchronized*/ void m() { //同步方法，在同一个时刻，只能有一个线程来执行run方法
        synchronized(object) { //同步代码块
            if (ticketNum <= 0) {
                System.out.println("售票结束。。");
                loop = false;
                return;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" + "剩余票数" + (--ticketNum));
        }

    }
    @Override
    public void run() {
        while(loop) {

            m(); //是同步方法

        }

    }
}


class SellTicket01 extends Thread {

    private static int ticketNum = 100; //让多个线程共享ticketNum

//    public void m1() {
//        synchronized(this) {
//            System.out.println("hello");
//        }
//    }
    @Override
    public void run() {
        while(true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束。。");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" + "剩余票数" + (--ticketNum) );
        }
    }
}

class SellTicket02 implements Runnable {
    private static int ticketNum = 100; //让多个线程共享ticketNum
    @Override
    public void run() {
        while(true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束。。");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" + "剩余票数" + (--ticketNum) );
        }
    }
}