package IO流.IO流原理.InputStream;/*
 *@author yang
 */

import IO流.IO流原理.OutPutStream.Dog3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception{
        //指定反序列化的文件
        String filePath = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/OutPutStream/data.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取
        //读取的顺序（反序列化）需要和保存数据（序列化）的顺序一致
        //否则会出现异常
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println("运行类型" + dog.getClass());
        System.out.println("dog信息=" + dog);

        //调用dog方法，需要向下转型
        //需要将Dog类的定义，拷贝到可以引用的位置
        Dog3 dog2 = (Dog3)dog;
        System.out.println(dog2.getName());


        ois.close();


    }


}
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}