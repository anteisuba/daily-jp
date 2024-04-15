package IO流.IO流原理.properties;/*
 *@author yang
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        //创建
        Properties properties = new Properties();
        //加载
        properties.load(new FileReader("/Users/dreamtank/JDK/IDEAtest/src/mysql.properties"));
        //k-v显示到控制台
        //properties.list(System.out);
        //根据k获取v
        String user = properties.getProperty("users");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名=" + user + "密码=" + pwd);


    }
}
