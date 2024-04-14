package IO流.IO流原理.copy;/*
 *@author yang
 */

import java.io.*;

public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcPath = "/Users/dreamtank/JDK/IDEAtest/out/production/IDEAtest/IO流/IO流原理/copy/bomb_1.gif";
        String destPath = "/Users/dreamtank/JDK/IDEAtest/out/production/IDEAtest/IO流/IO流原理/bomb_1.gif";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {

            bis = new BufferedInputStream(new FileInputStream(srcPath));
            bos = new BufferedOutputStream(new FileOutputStream(destPath));
            byte[] buff = new byte[1024];
            int readLen = 0;
            while((readLen = bis.read(buff)) != -1) {
                bos.write(buff,0,readLen);
            }

        }  catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bis != null) {

                    bis.close();
                }
                if (bos != null) {

                    bos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
