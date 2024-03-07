package 面向对象中级.homework;

public class Homework08 {
    public static void main(String[] args) {
        LabeledPoint yang = new LabeledPoint(1999, 12.1, "yang");
        System.out.println(yang);

    }
}
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }
}
