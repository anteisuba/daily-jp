package 项目.坦克大战.tankgame;/*
 *@author yang
 坦克大战的绘图区域
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {
    Mytank mytank = null;
    public MyPanel() {
        mytank = new Mytank(100,100); //初始化自己的坦克

    }

    int a = 0;
    int b = 0;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750); //填充矩形，默认黑色
        drawTank(a, b, g,0,0);
        drawTank(mytank.getX() + 60, mytank.getY() +30, g,1,1);

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

        //根据方向，绘制坦克
        switch (direct) {
            case 0: //表示向上
                g.fill3DRect(x, y, 60,10,false); //左边轮子
                g.fill3DRect(x+10,y+10,40,20,false); //中间轮子
                g.fill3DRect(x,y + 30,60,10,false); //右边轮子
                g.drawOval(x+20,y+10,20,20); //圆形盖子
                g.drawLine(x+40,y+20,x+60,y+20); //炮筒
                break;
            case 1: //表示向右面
                g.fill3DRect(x, y, 10,60,false); //左边轮子
                g.fill3DRect(x+10,y+10,20,40,false); //中间轮子
                g.fill3DRect(x+30,y,10,60,false); //右边轮子
                g.drawOval(x+10,y+20,20,20); //圆形盖子
                g.drawLine(x+20,y+30,x+20,y); //炮筒
                break;



        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            b+=3;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            b-=3;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            a+=3;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            a-=3;
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
