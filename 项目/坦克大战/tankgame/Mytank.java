package 项目.坦克大战.tankgame;/*
 *@author yang
 自己的tank
 */

public class Mytank extends Tank{
    //定义一个Shot对象,表示一个射击（线程）
    Shot shot = null;

    public Mytank(int x, int y) {
        super(x, y);
    }
    public void shotEnemyTank() {
        //创建shot对象，根据当前mytank对象的位置和方向来创建shot
        switch(getDirect()) {
            case 0: //右
                shot = new Shot(getX() + 60,getY()+20,0);
                break;
            case 1: //向上
                shot = new Shot(getX() + 20,getY(),1);
                break;
            case 2: //向下
                shot = new Shot(getX() + 20,getY() + 60,2);
                break;
            case 3: //
                shot = new Shot(getX(),getY() + 20,3);


        }
        //启动线程
        new Thread(shot).start();

    }

}
