package 反射;/*
 *@author yang
 */

public class Car {
    public String brand = "宝马";
    public int price = 50000;
    public String color = "red";

    @Override
    public String  toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
