package qqcommon;/*
 *@author yang
 */

public interface MessageType {
    //在接口中定义了一些常量
    //不同的常量的值，表示不同的消息类型
    String MESSAGE_LOGIN_SUCCEED = "1"; //登陆成功
    String MESSAGE_LOGIN_FAIL = "2";
    String MESSAGE_COMM_MES = "3"; //普通信息包
    String MESSAGE_GET_ONLINE_FRIEND = "4"; //要求返回在线用户列表
    String MESSAGE_RET_ONLINE_FRIEND = "5"; //返回在线用户列表
    String MESSAGE_CLIENT_EXIT = "6"; //返回在线用户列表

}
