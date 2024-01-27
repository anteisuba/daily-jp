package 面向对象编程基础.overload;

public class OverLoadExercise02 {
	public static void main(String[] args) {
		Methods02 m2 = new Methods02();
		System.out.println(m2.max(1, 2));
		System.out.println(m2.max(1.1, 2.2));
		System.out.println(m2.max(1.1, 2.2,3.3));
	}
}

class Methods02 {
	public int max(int a ,int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public double max(double a ,double b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public double max(double a ,double b,double c) {
		if(a >b && a > c) {
			return a;
		} else if(b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}
}