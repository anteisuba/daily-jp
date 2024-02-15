package 项目.零钱通.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 该类完成零钱通各个功能的类
* 使用oop（面向对象编程）
* 将各个功能对应一个方法
*
* */
public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner myscanner = new Scanner(System.in);
    //        String key = "";
    String details = "----零钱通明细-----";

    double money = 0;
    double balance = 0;
    Date date = null;  //Date是java.util.Date类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    String note = "";


    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("\n===零钱通菜单(00P)====");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.println("请选择(1-4) ： ");
            String key = myscanner.next();

            //使用switch分支控制
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误");

            }
        }while (loop);
    }
    //完成零钱通的明细

    public void detail() {
        System.out.println(details);
    }
    public void income() {
        System.out.print("收益入账金额");
        money = myscanner.nextDouble();
        //money应有校验
        if (money <= 0) {
            System.out.println("收益入账金额 需要 大于0");
            return;
        }
        balance += money;
        date = new Date(); //获取当前日期
        //System.out.println(sdf.format(date));
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;

    }


    public void pay() {
        money = myscanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应该在0-" + balance);
            return; //退出方法，不在执行后面的方法

        }
        System.out.println("消费说明：");
        note = myscanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;

    }

    public void exit() {
        String choice = "";
        while (true) { //要求用户必须输入y/n否则一直循环
            System.out.println("你确定要退出吗 y/n");
            choice = myscanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }


}
