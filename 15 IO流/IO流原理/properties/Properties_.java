package IO流.IO流原理.properties;/*
 *@author yang
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties_ {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/dreamtank/JDK/IDEAtest/src/mysql.properties"));
        String line = "";
        while((line = bufferedReader.readLine()) != null) {
            String[] split = line.split("=");
            if ("ip".equals(split[0])) {


                System.out.println(split[0] + "值是：" + split[1]);
            }
        }
        bufferedReader.close();
    }
}
