package 线程;/*
 *@author yang
 */

public class ThreadExit_ {
    public static void main(String[] args) {
        T t = new T();
        Thread thread = new Thread(t);
        thread.start();
        //如果希望main线程去控制t线程的终止，必须可以修改loop变量
        //让t1退出run方法，从而终止 t1线程 -> 通知方式

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t.setLoop(false);


    }
}

class T implements Runnable{
    //设置一个控制变量
    private boolean loop = true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        int count = 0;


        while(loop) {
            System.out.println("count" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T运行中");
            if (count == 50) {
                break;
            }
        }
    }
}
