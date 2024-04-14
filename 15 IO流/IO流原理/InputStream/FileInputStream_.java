package IO流.IO流原理.InputStream;/*
 *@author yang
 */


import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile02() {
        java.lang.String Path01 = "src/IO流/IO流原理/Hello.txt";
        byte[] buf = new byte[8];
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(Path01);
            while((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new java.lang.String(buf,0,readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }   finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}