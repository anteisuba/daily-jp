package 项目.坦克大战.tankgame;/*
 *@author yang
 */

import javax.swing.*;

public class YangTankGame01 extends JFrame {
    //定义MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        YangTankGame01 game01 = new YangTankGame01();
    }
    public YangTankGame01() {
        mp = new MyPanel();

        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp); //把面板加入
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);

    }
}
