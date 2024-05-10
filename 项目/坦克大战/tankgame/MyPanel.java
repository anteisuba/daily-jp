package 项目.坦克大战.tankgame;/*
 *@author yang
 坦克大战的绘图区域
 */

import 集合.List_.Vector_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Vector;


//为了监听键盘事件，实现KeyListener
//为了让Panel不停的重绘子弹，需要将MyPanel做成线程
public class MyPanel extends JPanel implements KeyListener,Runnable {
    Mytank mytank = null;
    //定义敌人坦克，放入Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //定一个存放Node对象的Vector，用于恢复敌人坦克的坐标和方向
    Vector<Node> nodes = new Vector<>();
    //定义一个Vector，用于存放炸弹
    //当子弹击中坦克时，加入一个Bomb对象到bombs

    Vector<Boom> bombs = new Vector<>();

    //定义三张炸弹的图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

   int enemyTankSize = 3;


    public MyPanel(String key) {
        //先判断记录的文件是否存在
        //如果存在，就正常执行，如果文件不存在，提示只能开启新游戏key="1"
        File file = new File(Recorder.getRecordFile());
        if (file.exists()) {
            nodes = Recorder.getNodesAndEnemyTankNumRec();
        } else {
            System.out.println("文件不存在，只能开启新的游戏");
            key = "1";
        }
        //将MyPanel对象的 enemyTanks 设置给 Recorder 的 enemyTanks
        Recorder.setEnemyTanks(enemyTanks);
        mytank = new Mytank(500,100); //初始化自己的坦克

        switch(key) {
            case "1":
                //初始化敌人的坦克
                for (int i = 0; i < enemyTankSize; i++) {
                    //创建敌人坦克
                    EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
                    //将enemyTanks设置给enemyTank
                    enemyTank.setEnemyTanks(enemyTanks);
                    //设置方向
                    enemyTank.setDirect(2);
                    //启动敌人坦克线程
                    new Thread(enemyTank).start();
                    //给该enemyTank 加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20,enemyTank.getY() + 60,enemyTank.getDirect());
                    //加入enemyTank的Vector成员
                    enemyTank.shots.add(shot);
                    new Thread(shot).start();
                    //加入
                    enemyTanks.add(enemyTank);
                }
                break;
            case "2": //继续上局游戏
                //初始化敌人的坦克
                for (int i = 0; i < nodes.size(); i++) {
                    Node node = nodes.get(i);
                    //创建敌人坦克
                    EnemyTank enemyTank = new EnemyTank(node.getX(), node.getY());
                    //将enemyTanks设置给enemyTank
                    enemyTank.setEnemyTanks(enemyTanks);
                    //设置方向
                    enemyTank.setDirect(node.getDirect());
                    //启动敌人坦克线程
                    new Thread(enemyTank).start();
                    //给该enemyTank 加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20,enemyTank.getY() + 60,enemyTank.getDirect());
                    //加入enemyTank的Vector成员
                    enemyTank.shots.add(shot);
                    new Thread(shot).start();

                    //加入
                    enemyTanks.add(enemyTank);
                }
                break;
            default:
                System.out.println("你的输入有误");
        }

        mytank.setSpeed(10);


        //初始化图片对象
//        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom1_.gif"));
//        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom2_.gif"));
//        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/boom3_.gif"));
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));

        //这里在播放指定的音乐
        new AePlayWave("/Users/dreamtank/JDK/IDEAtest/src/111.wav").start();

    }


    //编写方法，显示我方击毁敌方坦克信息
    public void showInfo(Graphics g) {
        //画出玩家的总成绩
        g.setColor(Color.black);
        Font font = new Font("宋体",Font.BOLD,25);
        g.setFont(font);
        g.drawString("您累积击毁敌方坦克",1020,30);
        drawTank(1020,60,g,1,0); //画出一个敌方坦克
        g.setColor(Color.black); //这里需要重新设置成黑色
        g.drawString(Recorder.getAllEnemyTankNum() + "",1080,100);

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillRect(0,0,1000,750); //填充矩形，默认黑色

        showInfo(g);

        if (mytank != null && mytank.isLive) {

            drawTank(mytank.getX(),mytank.getY(), g, mytank.getDirect(), 0);
        }

        //mytank射击的子弹
//        if (mytank.shot != null && mytank.shot.isLive == true) {
//            g.fill3DRect(mytank.shot.x , mytank.shot.y,5,5,false);
//        }
        //将mytank的子弹集合shots，遍历取出绘制
        for (int i = 0; i < mytank.shots.size(); i++) {
            Shot shot = mytank.shots.get(i);
            if (mytank.shot != null && shot.isLive) {
            g.fill3DRect(shot.x , shot.y,5,5,false);
        } else { //如果该shot对象已经无效了 就从shots集合中拿掉
                mytank.shots.remove(shot);
            }
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

    //判断我方子弹是否击中敌人坦克时，就需要把我们的子弹集合中所有的子弹，都取出和敌人的所有坦克，进行判断
    public void hitEnemyTank() {
        //遍历我们的子弹
//        for (int j = 0; j < mytank.shots.size(); j++) {
//            Shot shot = mytank.shots.get(j);
//            //判断是否击中了坦克
//            if (shot != null && shot.isLive) {
//                for (int i = 0; i < enemyTanks.size(); i++) {
//                    EnemyTank enemyTank = enemyTanks.get(i);
//                    hitTank(mytank.shot, enemyTank);
//                }
//            }
//        }

        //单颗子弹
        if (mytank.shot != null && mytank.shot.isLive) {
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                hitTank(mytank.shot, enemyTank);
            }
        }

    }

    //判断敌人坦克是否击中我的坦克
    public void hitHero() {
        //遍历所有的敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出敌人坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //遍历enemyTank对象的所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //取出当前子弹
                Shot shot = enemyTank.shots.get(j);
                //判断shot是否击中我的坦克
                if (mytank.isLive && shot.isLive) {
                    hitTank(shot,mytank);
                }

            }
        }
    }



    //判断我放坦克的子弹是否击中敌人坦克
    public void hitTank(Shot s,Tank enemyTank) {
        //判断s击中坦克
        switch(enemyTank.getDirect()) {
            case 1: //坦克向上
            case 2: //坦克向下
                if(s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                   && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //当我方子弹击中敌人坦克后，将enemyTank从Vector中去掉
                    enemyTanks.remove(enemyTank);
                    //当我放击毁一个敌人坦克时，就对数据allEnemyTankNum++
                    if (enemyTank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
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
                    enemyTanks.remove(enemyTank);
                    if (enemyTank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
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
            if (mytank.getY() + 60 < 750) {
                mytank.moveDown();
            }



        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            mytank.setDirect(1);
            if (mytank.getY() > 0) {
                mytank.moveUp();
            }


        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            mytank.setDirect(0);
            if (mytank.getX() + 60 < 1000) {
                mytank.moveRight();
            }

        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            mytank.setDirect(3);
            if (mytank.getX() > 0) {
                mytank.moveLeft();

            }
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            //判断hero的子弹是否销毁，发射一颗子弹
//            if (mytank.shot == null || !mytank.shot.isLive) {
//                mytank.shotEnemyTank();
//            }
            //发射多颗子弹
            mytank.shotEnemyTank();
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

            hitEnemyTank();
            hitHero();
            this.repaint();
        }

    }
}
