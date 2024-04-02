package 项目.坦克大战.java绘图技术;/*
 *@author yang
 */

import javax.swing.*;
import java.awt.*;

public class Drawtest extends JFrame {
    MyPanel02 my = null;
    public static void main(String[] args) {
        new Drawtest();
    }
    public Drawtest() {
        my = new MyPanel02();
        this.add(my);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel02 extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10,10,100,200);
        g.drawLine(60,110,60,10);
        g.setColor(Color.magenta);
        g.fillRect(30,30,50,100);
    }
}

