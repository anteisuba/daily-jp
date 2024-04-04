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
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();

    }
}

class SellTicket01 extends Thread {

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