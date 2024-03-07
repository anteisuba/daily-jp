package 面向对象高级.接口;


//phone类需实现UsbInterface接口 规定/声明方法
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
