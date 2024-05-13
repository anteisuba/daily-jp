package qqclient.view;/*
 *@author yang
 客户端的菜单界面
 */


import jdk.jshell.execution.Util;
import qqclient.service.UserClientService;
import qqclient.utils.Utility;
import qqcommon.User;

public class QQView {


    private boolean loop = true; //控制是否显示菜单
    private String key = ""; //接收用户的键盘输入

    private UserClientService userClientService = new UserClientService(); //对象是用于登录服务器

    public static void main(String[] args) {
        new QQView().mainMenu();
        System.out.println("客户端退出系统");
    }



    //显示主菜单
    private void mainMenu() {
        while(loop) {
            System.out.println("====欢迎登陆网络通讯系统=====");
            System.out.println("\t\t 1 登陆系统");
            System.out.println("\t\t 9 退出系统");
            System.out.println("请输入你的选择： ");

            key = Utility.readString(1);

            //根据用户的输入，来处理不同的逻辑
            switch (key) {
                case "1":
                    System.out.println("请输入你用户号：");
                    String userId = Utility.readString(50);
                    System.out.println("请输入密码：");
                    String pwd = Utility.readString(50);
                    //验证该用户是否合法
                    if (userClientService.checkUser(userId,pwd)) {
                        System.out.println("====欢迎(用户 " + userId + "====");
                        //进入到二级菜单
                        while (loop) {
                            System.out.println("\n ====网络通信系统二级菜单(用户 " + userId + ")====");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            System.out.println("请输入你的选择： ");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    System.out.println("显示在线用户列表");
                                    break;
                                case "2":
                                    System.out.println("群发消息");
                                    break;
                                case "3":
                                    System.out.println("私聊消息");
                                    break;
                                case "4":
                                    System.out.println("发送文件");
                                    break;
                                case "9":
                                    loop = false;
                                    break;
                            }
                        }
                    } else { //登陆服务器失败
                        System.out.println("=====登陆失败=====");
                    }
                    break;
                case "9":
                    loop = false;
                    break;
            }

        }
    }
}
