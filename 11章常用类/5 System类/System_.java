package 常用类.System类;/*
 *@author yang
 */

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        System.out.println("ok1");
        //exit(0)表示退出程序
        //0 表示一个状态，正常的状态
        //System.exit(0);
        System.out.println("ok2");

        //arraycopy : 复制数组元素，比较适合底层调用
        //一般使用Arrays.copyOf完成复制数组
        int[] src = {1,2,3};
        int[] dest = new int[3];
        /*
        * src 源数组
        * srcPos 从原数组那个索引位置开始拷贝
        * dest 目标数组，把源数组的数据拷贝到哪个数组
        * destPos 把源数组的数据拷贝到目标数组的哪个索引
        * length 从源数组拷贝多少个数据到目标数组
        * */
        System.arraycopy(src,0,dest,0,src.length-1);
        System.out.println("dest=" + Arrays.toString(dest));

        //currentTimeMillens:返回毫秒数


    }
}
