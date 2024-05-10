package 项目.坦克大战.tankgame;/*
 *@author yang
 */

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class YangTankGame01 extends JFrame {
    //定义MyPanel
    MyPanel mp = null;

    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        YangTankGame01 game01 = new YangTankGame01();
    }
    public YangTankGame01() {
        System.out.println("请输入选择1：新游戏 2:继续上局");
        String key = myScanner.next();
        mp = new MyPanel(key);
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp); //把面板加入
        this.setSize(1300,950);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);

        //在JFrame中增加相应关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);
            }
        });

    }
}
