package qqclient.service;/*
 *@author yang
 */

import java.util.HashMap;

public class ManageClientConnectServerThread {
    //把多个线程放入HashMap集合中，key就是用户id，value就是线程
    private static HashMap<String,ClientConnectServerThread> hm = new HashMap<>();

    //将某个线程加入到集合中
    public static void addClientConnentServerThread(String userId,ClientConnectServerThread clientConnectServerThread) {
        hm.put(userId,clientConnectServerThread);
    }

    //通过userId，得到对应的线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId) {
        return hm.get(userId);
    }

}
