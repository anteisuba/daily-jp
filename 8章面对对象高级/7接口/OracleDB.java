package 面向对象高级.接口;

public class OracleDB implements DBInterface{
    @Override
    public void conncet() {
        System.out.println("连接OracleDB");
    }

    @Override
    public void close() {
        System.out.println("关闭OracleDB");
    }
}
