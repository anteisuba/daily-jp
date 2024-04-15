package IO流.IO流原理;/*
 *@author yang
 */

public class InputAndOutput {
    public static void main(String[] args) {
        //System.in 编译类型    InputStream
        //System.in 运行类型    BufferedInputStream
        //标准输入   键盘
        System.out.println(System.in.getClass());  //查看运行类型

        //System.out 编译类型   PrintStream
        //System.out 运行类型   PrintStream
        //表示标准输出   显示器
        System.out.println(System.out.getClass());
    }
}
