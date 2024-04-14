package IO流.IO流原理.copy;/*
 *@author yang
 */

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {
        //BufferedReader和BufferedWriter 是安装字符操作
        //不要去操作二进制文件，可能造成文件损坏

        String filePath1 = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/copy/FileCopy.java";
        String filePath2 = "/Users/dreamtank/JDK/IDEAtest/src/IO流/IO流原理/copy/FileCopy2.java";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(filePath1));
            bw = new BufferedWriter(new FileWriter(filePath2));
            while((line = br.readLine()) != null) {
                //每读取一行就写入
                bw.write(line);
                //换行
                bw.newLine();
            }
            //读取写入
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
