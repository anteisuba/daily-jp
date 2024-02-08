package 面向对象中级.四继承.homework;

public class NotePad extends Computer{
    private String color;

    public NotePad(String CPU, int momory, int disk, String color) {
        super(CPU, momory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo02() {
        System.out.println("NotePad信息=");
        System.out.println(getDetails() + "color=" + color);
    }
}
