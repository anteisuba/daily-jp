package 面向对象编程基础.this函数;



public class Homework13 {
	public static void main(String[] args) {
		Circle02 c = new Circle02();
		PassObject po = new PassObject();
		po.printAreas(c,5);
	}
	
}

class Circle02 {
	double radius;
	public Circle02() {
		
	}
	public Circle02(double raduis) {
		this.radius = raduis;
	}
	public double findArea() {
		return Math.PI * radius * radius;
	}
	//添加一个方法来修改setRadius，修改对象的半径值
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}

class PassObject {
	Circle02 circle02 = new Circle02(1);
	public void printAreas(Circle02 c,int times) {
		System.out.println("radius\tarea");
		for (int i = 1; i <= times; i++) {
			c.setRadius(i);
			c.findArea();
			System.out.println(i + "\t" + c.findArea());
		}
	}
	
	
}

