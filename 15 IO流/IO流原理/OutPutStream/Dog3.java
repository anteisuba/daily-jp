package IO流.IO流原理.OutPutStream;/*
 *@author yang
 */

import java.io.Serializable;

public class Dog3 implements Serializable{

    private String name;
    private int age;

    public Dog3(String name, int age) {
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

