package 项目.坦克大战.event_;/*
 *@author yang
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
    MyPanel mp = null;
    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        //窗口JFrame 对象可以监听键盘事件，即可以监听到面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
//面板

class MyPanel extends JPanel implements KeyListener { //监听器，监听键盘事件
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) { //为了让小球移动，把左上角的坐标设置成变量

        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) { //有字符输出时就会触法

    }

    @Override
    public void keyPressed(KeyEvent e) { //当某个键按下，该方法会触发
        //System.out.println((char) e.getKeyCode() + "被按下");
        if (e.getKeyCode() == KeyEvent.VK_DOWN) { //KeyEvent.VK_DOWN就是向下的箭头对应的code值
            y+=2;

        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        }

        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) { //当某个键松开，该方法会触发

    }
}