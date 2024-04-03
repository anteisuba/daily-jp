package 项目.坦克大战.tankgame;/*
 *@author yang
 坦克大战的绘图区域
 */

import 集合.List_.Vector_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener {
    Mytank mytank = null;
   Vector<EnemyTank> enemyTanks = new Vector<>();
   int enemyTankSize = 3;
    public MyPanel() {
        mytank = new Mytank(100,100); //初始化自己的坦克
        mytank.setSpeed(10);
        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            //创建敌人坦克
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            //设置方向
            enemyTank.setDirect(2);
            //加入
            enemyTanks.add(enemyTank);
        }

    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750); //aa填充矩形，默认黑色
        drawTank(mytank.getX()+120,mytank.getY()+120, g, mytank.getDirect(), 0);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
        }
    }


    //画出坦克，封装方法
    /*
    * x,y是坐标
    * g 画笔
    * direct 坦克方向（上下左右）
    * type 坦克类型
    * */
    public void drawTank(int x,int y,Graphics g,int direct,int type) {
        //根据不同类型的坦克，设置不同颜色
        switch(type) {
            case 0://我们的坦克
                g.setColor(Color.CYAN);
                break;
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据方向，绘制坦克 0 向右 1 向上 2 向下 3 向左
        switch (direct) {
            case 0: //表示向右
                g.fill3DRect(x, y, 60,10,false); //左边轮子
                g.fill3DRect(x+10,y+10,40,20,false); //中间轮子
                g.fill3DRect(x,y + 30,60,10,false); //右边轮子
                g.drawOval(x+20,y+10,20,20); //圆形盖子
                g.drawLine(x+40,y+20,x+60,y+20); //炮筒
                break;
            case 1: //表示向上
                g.fill3DRect(x, y, 10,60,false); //左边轮子
                g.fill3DRect(x+10,y+10,20,40,false); //中间轮子
                g.fill3DRect(x+30,y,10,60,false); //右边轮子
                g.drawOval(x+10,y+20,20,20); //圆形盖子
                g.drawLine(x+20,y+30,x+20,y); //炮筒
                break;
            case 2: //表示向下
                g.fill3DRect(x, y, 10,60,false); //左边轮子
                g.fill3DRect(x+10,y+10,20,40,false); //中间轮子
                g.fill3DRect(x+30,y,10,60,false); //右边轮子
                g.drawOval(x+10,y+20,20,20); //圆形盖子
                g.drawLine(x+20,y+30,x+20,y+60); //炮筒
                break;
            case 3: //表示向左
                g.fill3DRect(x, y, 60,10,false); //左边轮子
                g.fill3DRect(x+10,y+10,40,20,false); //中间轮子
                g.fill3DRect(x,y + 30,60,10,false); //右边轮子
                g.drawOval(x+20,y+10,20,20); //圆形盖子
                g.drawLine(x+40,y+20,x,y+20); //炮筒
                break;


        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_S) {
            mytank.setDirect(2);
            mytank.moveDown();


        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            mytank.setDirect(1);
            mytank.moveUp();

        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            mytank.setDirect(0);
            mytank.moveRight();

        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            mytank.setDirect(3);
            mytank.moveLeft();
        }

        this.repaint();
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}
