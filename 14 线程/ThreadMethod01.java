package 线程;/*
 *@author yang
 */

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo1 demo1 = new ThreadDemo1();
        demo1.setName("yang");
        demo1.setPriority(Thread.MAX_PRIORITY);
        demo1.start();
        System.out.println(demo1.getName());
        //主线程打印5个hi，然后中断子线程的休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);

        }

        System.out.println(demo1.getName() + "线程优先级" + demo1.getPriority());
        demo1.interrupt(); //当执行到这里时，就会中断t线程的休眠
    }
}
class ThreadDemo1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "吃包子" + i);
        }

        try {
            System.out.println(Thread.currentThread().getName() + "休眠中");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "被interrupt了");
        }

    }
}