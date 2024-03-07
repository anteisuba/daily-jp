package 面向对象高级.接口;

public class MysqlDB implements DBInterface{
    @Override
    public void conncet() {
        System.out.println("连接mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}
