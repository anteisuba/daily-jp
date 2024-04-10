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


//为了监听键盘事件，实现KeyListener
//为了让Panel不停的重绘子弹，需要将MyPanel做成线程
public class MyPanel extends JPanel implements KeyListener,Runnable {
    Mytank mytank = null;
    //定义敌人坦克，放入Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //定义一个Vector，用于存放炸弹
    //当子弹击中坦克时，加入一个Bomb对象到bombs

    Vector<Boom> bombs = new Vector<>();

    //定义三张炸弹的图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

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
            //给该enemyTank 加入一颗子弹
            Shot shot = new Shot(enemyTank.getX() + 20,enemyTank.getY() + 60,enemyTank.getDirect());
            //加入enemyTank的Vector成员
            enemyTank.shots.add(shot);
            new Thread(shot).start();

            //加入
            enemyTanks.add(enemyTank);



        }

        //初始化图片对象
//        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom1_.gif"));
//        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom2_.gif"));
//        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom3_.gif"));
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750); //aa填充矩形，默认黑色

        drawTank(mytank.getX(),mytank.getY(), g, mytank.getDirect(), 0);
        //mytank射击的子弹
        if (mytank.shot != null && mytank.shot.isLive == true) {
            g.fill3DRect(mytank.shot.x , mytank.shot.y,5,5,false);
        }

        //如果bombs集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Boom boom = bombs.get(i);
            //根据当前这个boom对象的life值去画出对应的图片
            if (boom.life > 6) {
                g.drawImage(image1,boom.x,boom.y,60,60,this);
            } else if(boom.life > 3) {
                g.drawImage(image2,boom.x,boom.y,60,60,this);
            } else {
                g.drawImage(image3,boom.x,boom.y,60,60,this);
            }
            //让这个炸弹的生命值减少
            boom.lifeDown();
            //如果boomlife为0，就从booms的集合中删除
            if (boom.life == 0) {
                bombs.remove(boom);
            }
        }

        //敌人的坦克，遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //从Vector取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断当前坦克是否还存活
            if (enemyTank.isLive) { //当敌人坦克存活才画出该坦克
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
                //画出enemTank 所有子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);
                    //绘制
                    if (shot.isLive == true) {
                        g.fill3DRect(shot.x, shot.y, 5, 5, false);
                    } else {
                        enemyTank.shots.remove(shot);
                    }
                }
            }
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

    //判断我放坦克的子弹是否击中敌人坦克
    public void hitTank(Shot s,EnemyTank enemyTank) {
        //判断s击中坦克
        switch(enemyTank.getDirect()) {
            case 1: //坦克向上
            case 2: //坦克向下
                if(s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                   && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //创建Bomb对象，加入到bombs集合
                    Boom bomb = new Boom(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);

                }
                break;
            case 0: //坦克向右

            case 3: //坦克向左
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //创建Bomb对象，加入到bombs集合
                    Boom bomb = new Boom(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
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
        if (e.getKeyCode() == KeyEvent.VK_J) {
            mytank.shotEnemyTank();
            System.out.println("用户按下了J，开始射击");
        }
        //让面板重绘
        this.repaint();
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() { //每隔100毫秒，重绘区域
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //判断是否击中敌人坦克
            if (mytank.shot != null && mytank.shot.isLive) {
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(mytank.shot, enemyTank);
                }
            }

            this.repaint();
        }

    }
}
