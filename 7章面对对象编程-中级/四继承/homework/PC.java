package 面向对象中级.四继承.homework;

public class PC extends Computer{
    private String brand;
    public PC(String CPU, int momory, int disk, String brand) {
        super(CPU, momory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo() {
        System.out.println("PC信息=");
        System.out.println(getDetails() + "brand=" + brand);
    }
}
