package 枚举和注解.注解;/*
 *@author yang
 */

import java.util.ArrayList;

public class SuppressWarnings_ {
    //@SuppressWarnings({"rawtypes","unchecked","unused"})
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        //1 当不希望看到警告的时候，可以用SuppressWarinings注解来抑制警告信息
        //2 在{}中，可以写入你希望抑制的警告信息
        //3 关于SuppressWarning 作用范围是和你放置的位置相关

        list.add("");
        list.add("");
        list.add("");
        int i;
        System.out.println(list.get(1));

    }
}

