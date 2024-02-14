package 项目.零钱通;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class SmallchangeSys {
    //1 想完成显示菜单，并可以选择菜单，并给出对应提示
    //2 完成零钱通明细
    //3 完成收益入账
    //4 完成消费
    //5 退出
    //6 用户输入退出时，给出提示“你确定要退出吗” y/n 必须正确输入循环指令，否则循环


    public static void main(String[] args) {
        boolean loop = true;
        Scanner myscanner = new Scanner(System.in);
//        String key = "";
        String details = "----零钱通明细-----";

        double money = 0;
        double balance = 0;
        Date date = null;  //Date是java.util.Date类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String note = "";


        do {
            System.out.println("\n===零钱通菜单====");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.println("请选择(1-4) ： ");
            String key = myscanner.next();

            //使用switch分支控制
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额");
                    money = myscanner.nextDouble();
                    //money应有校验
                    if (money <= 0) {
                        System.out.println("收益入账金额 需要 大于0");
                        break;
                    }
                    balance += money;
                    date = new Date(); //获取当前日期
                  //System.out.println(sdf.format(date));
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    money = myscanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额应该在0-" + balance);
                        break;
                    }
                    System.out.println("消费说明：");
                    note = myscanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
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
                    break;
                default:
                    System.out.println("选择有误");

            }
        }while (loop);
        System.out.println("退出了零钱通项目");

    }
}
