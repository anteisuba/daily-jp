package 线程;/*
 *@author yang
 */

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();

        //如果我们希望当main线程结束后，子线程自动结束
        //只需将子线程设为守护线程即可
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 1;i <= 10;i++) {
            System.out.println("baoqinag");
            Thread.sleep(1000);
        }
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (; ;) { //无限循环
            try {
                Thread.sleep(100); //休眠100
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("marong");
        }
    }
}
