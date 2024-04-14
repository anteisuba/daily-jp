package IO流.IO流原理.reader;/*
 *@author yang
 */

public abstract class Reader_ {

//    public void readFile() {}
//    public void readString() {}

    //在Reader_抽象类，使用read方法同一管理,利用动态绑定机制
    public abstract  void read();
}

class FileReder_ extends Reader_ {


    @Override
    public void read() {
        System.out.println("对文件进行读取");
    }
}
class StringReader_  extends Reader_ {
    @Override
    public void read() {
        System.out.println("对字符串进行读取");
    }
}

class BufferedReader_ extends Reader_{
    //做成处理流
    private Reader_ reader_; //属性是Reader_类型

    public void readFile() {
        reader_.read();
    }

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    //多次读取文件
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.read();
        }
    }
    //扩展 readString，批量处理字符串数据
    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.read();
        }
    }

    @Override
    public void read() {
        System.out.println("buffer");
    }
}