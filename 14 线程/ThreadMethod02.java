package 线程;/*
 *@author yang
 */

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T0 t0 = new T0();
        t0.start();
        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程吃了" + i + "个包子");
            if (i == 5) {
                System.out.println("主线程让子线程先吃");
                //t0.join(); //这里让t0插队，先执行完毕在执行主线程
                Thread.yield();

                System.out.println("线程吃完了，主线程接着吃");
            }
        }

    }
}

class T0 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程吃了" + i + "包子");
        }
    }
}
