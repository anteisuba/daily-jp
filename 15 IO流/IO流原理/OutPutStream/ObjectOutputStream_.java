package IO流.IO流原理.OutPutStream;/*
 *@author yang
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception{
        //序列化后，保存的文件格式，不是纯文本，而是按照他的格式来保存
        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/OutPutStream/data.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        //序列化数据
        oos.writeInt(100); //int => Integer 实现了Serializable
        oos.writeBoolean(true); //boolean -> Boolean
        oos.writeChar('a'); //char -> Character
        oos.writeDouble(9.5); //doubel -> Double
        oos.writeUTF("yangjian"); //String
        oos.writeObject(new Dog3("yan",24));
        oos.close();
        System.out.println("数据保存完毕（序列化形式）");
    }
}

//如果需要序列化某个类的对象，实现Serializable
