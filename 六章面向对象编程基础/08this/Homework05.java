package 面向对象编程基础.this函数;

public class Homework05 {
	public static void main(String[] args) {
		Circle circle = new Circle(1);
		System.out.println("周长是" + circle.len());
		System.out.println("面积是=" + circle.area());
	}
}

class Circle {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double len() {
		
		return 2 * Math.PI * radius;
	}
	
	public double area() {
		return Math.PI  * radius * radius;
	}
	
}
