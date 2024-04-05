package 线程;/*
 *@author yang
 */

public class ThreadMethodExercise extends Thread{
    public static void main(String[] args) throws InterruptedException {


        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
            if (i == 5) {
                Hi hi = new Hi();
                Thread thread = new Thread(hi);
                thread.start();
                thread.join();
            }
        }

    }
}

class Hi implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("hello" + (++count));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10) {
                System.out.println("子线程结束");
                break;
            }
        }


    }
}
