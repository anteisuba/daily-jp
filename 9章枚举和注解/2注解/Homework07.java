package 枚举和注解.注解;/*
 *@author yang
 */

public class Homework07 {
    public static void main(String[] args) {
        Car1 car1 = new Car1(60);
        car1.getAir().flow();
    }
}

class Car1 {
    public Car1(double temperature) {
        this.temperature = temperature;
    }

    private double temperature;
    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹冷气");
            } else if (temperature < 0){
                System.out.println("吹暖气");

            } else {
                System.out.println("关闭空调");
            }
        }

    }
    public Air getAir() {
        return new Air();
    }

}
