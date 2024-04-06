package 线程;/*
 *@author yang
 */

public class DealLock {
    public static void main(String[] args) {
        DeadLockDemo deadLockDemo = new DeadLockDemo(true);
        DeadLockDemo deadLockDemo1 = new DeadLockDemo(false);
        deadLockDemo.start();
        deadLockDemo1.start();
    }
}
class DeadLockDemo extends Thread {
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        //如果flag为真，该线程A会先持有o1 对象锁，然后去尝试 o2 对象锁
        //如果线程A得不到o2对象锁，就会进行Blocked
        //如果flag为false，线程B会先持有o2 对象锁，然后尝试去获取 o1 对象锁
        //如果线程B 得不到 o1 对象锁，就会Blocked
        if (flag) {
            synchronized(o1) { //对象互斥锁，下面是同步代码
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized(o2) { //这里获得li对象的监视权
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        } else {
            synchronized(o2) {
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized(o1) {
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}