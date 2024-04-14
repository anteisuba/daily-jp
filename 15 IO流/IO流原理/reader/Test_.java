package IO流.IO流原理.reader;/*
 *@author yang
 */

import IO流.IO流原理.reader.BufferedReader_;
import IO流.IO流原理.reader.FileReder_;
import IO流.IO流原理.reader.StringReader_;

public class Test_ {
    public static void main(String[] args) {
        //
        BufferedReader_ bufferedReader = new BufferedReader_(new FileReder_());
        bufferedReader.readFile();
        //bufferedReader.readFiles(4);
        BufferedReader_ bufferedReader1 = new BufferedReader_(new StringReader_());
        bufferedReader1.readStrings(5);
    }
}
