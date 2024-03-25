package 集合.Map_;/*
 *@author yang
 */

public class Properties_ {
    public static void main(String[] args) {
        //增加
        java.util.Properties properties = new java.util.Properties();
        properties.put("john",100);
        properties.put("lucy",100);
        properties.put("lic",99);
        properties.put("lic",100);
        System.out.println(properties);
        //通过k获取对应值 查找
        System.out.println(properties.get("lic"));
        //删除
        properties.remove("lucy");
        System.out.println(properties);

        //修改
        properties.put("john","yang");
        System.out.println(properties);


    }
}
