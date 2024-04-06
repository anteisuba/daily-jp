package 线程;/*
 *@author yang
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Homework01 extends Thread{
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);
        thread1.start();
        thread2.start();




    }


}

class A implements Runnable {
    private boolean loop = true;
    @Override
    public void run() {

        while(loop) {
            System.out.println((int)(Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
class B implements Runnable{
    private A a;
    private Scanner scanner = new Scanner(System.in);


    public B(A a) { //构造器中，直接传入A类对象
        this.a = a;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println("请输入你的指令Q表示退出:");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                //以通知的方式结束
                a.setLoop(false);
                System.out.println("B线程退出。");
                break;
            }
        }
    }
}
