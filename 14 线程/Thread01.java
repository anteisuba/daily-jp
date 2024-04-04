package 线程;/*
 *@author yang
 */

public class Thread01 {
    public static void main(String[] args) throws InterruptedException{
        //创建一个cat对象
        Cat cat = new Cat();
        cat.start();//启动线程→最终会执行cat的run方法
        //当main线程启动一个子线程 Thread-0，主线程不会阻塞,会继续执行
        //这时子线程和主线程是交替执行
        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程i=" + i);
            Thread.sleep(1000);
        }

    }
}

//当一个类继承了Thread类，该类就是一个线程
//重写run方法，写上自己业务代码
//run Thread类，实现类 Runnable 接口的 run 方法

class Cat extends Thread {

    int times = 0;
    @Override
    public void run() { //重写run方法，写上自己业务逻辑
        while(true) {
            System.out.println("miaomiao" + (++times) + "线程名称" + Thread.currentThread().getName());
            //让该线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80) {
                break;
            }
        }
    }
}