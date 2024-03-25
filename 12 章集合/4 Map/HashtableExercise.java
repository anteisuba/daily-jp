package 集合.Map_;/*
 *@author yang
 */

import java.util.Hashtable;

public class HashtableExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("john",100);
        //table.put(null,100); //异常
        //table.put("john",null); //异常
        table.put("lucy",100);
        table.put("lic",100);
        table.put("lic",88); //替换
        System.out.println(table);

        //底层有数组 Hashtable$Entry[] 初始化大小为11
        //临界值 threshold 8 = 11 * 0.75
        //按照自己的扩容机制进行
        //执行方法：addEntry（hash，key，value，index）；添加K-V封装到Entry
        //当if（count >= threshold)满足时，就进行扩容

    }
}
