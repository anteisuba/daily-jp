package 项目.坦克大战.java绘图技术;/*
 *@author yang
 */


import javax.swing.*;
import java.awt.*;

//画圆
@SuppressWarnings({"all"})
public class DrawCircle extends JFrame{  //加入一个框架

    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序～");

    }

    public DrawCircle() { //构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放入窗口
        this.add(mp);
        //设置窗口的大小
        this.setSize(400,300);
        this.setVisible(true); //可视化


    }
}
//先定义一个MyPanel，继承JPanel类，画图形，在面板上画
class MyPanel extends JPanel {

    //MyPanel对象就是一个面板
    //Graphics g 把 g 理解成一支画笔
    //Graphics 提供类很多绘图方法
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint方法被调用");
        g.drawOval(10,10,100,100);
        g.drawLine(20,20,150,150);
        g.drawRect(23,23,45,45);
        g.fillRect(23,23,45,45);
        g.setColor(Color.CYAN);
        g.fillOval(10,10,100,100);
        //画图片
        //Image image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/"));
        //g.drawImage(image1,20,20,150,200,this);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("beijing",100,100);
    }

}