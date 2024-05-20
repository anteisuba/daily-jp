package qqclient.service;/*
 *@author yang
 该类/对象完成 文件传输服务
 */

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.*;

public class FlieClientService {

    /*
    *   src 源文件
    *   dest 把该文件传输到对方的哪个目录
    *   senderId    发送用户id
    *   getterId    接收用户id
    * */
    public void sendFileToOne(String src,String dest,String senderId,String getterId) {
        //读取src文件 --->  message
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_FILE_MES);
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setSrc(src);
        message.setDest(dest);
        System.out.println("");
        //需要将文件读取
        FileInputStream fileInputStream =null;
        byte[] fileBytes = new byte[(int) new File(src).length()];

        try {
            fileInputStream = new FileInputStream(src);
            fileInputStream.read(fileBytes); //将src文件读入到程序的字节数组
            //将文件对应的字节数组设置到message
            message.getFileBytes();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        //提示信息
        System.out.println("\n" + senderId + "给" + getterId + "发送文件：" +src + "对方的电脑目录" + dest);

        //发送
        try {
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
