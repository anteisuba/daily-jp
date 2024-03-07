package 面向对象高级.接口;

public class Interface01 {
    public static void main(String[] args) {
        //Camer实现了接口
        Camera camera = new Camera();
        //Phone实现了接口
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone); //把手机接入到计算机
        computer.work(camera); //把相机接入到计算机

    }
}

