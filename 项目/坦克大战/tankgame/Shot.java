package 项目.坦克大战.tankgame;/*
 *@author yang
 */

public class Shot implements Runnable{
    int x; //子弹x坐标
    int y; //子弹y坐标
    int direct = 0; //子弹方向
    int speed = 2; //子弹速度

    boolean isLive = true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //根据方向改变x，y坐标
            switch(direct) {
                case 0: //右
                    x += speed;
                    break;
                case 1: //上
                    y -= speed;
                    break;
                case 2: //下
                    y += speed;
                    break;
                case 3: //左
                    x -= speed;
                    break;

            }

            System.out.println("子弹 x=" + x + "y =" + y);
            //当子弹移动到面板的边界时，就应该销毁
            if (!(x >= 0 && x <= 1000 && y>= 0 && y <= 750)) {
                System.out.println("子弹线程退出");
                isLive = false;
                break;
            }



        }
    }

}
