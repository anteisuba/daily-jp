package 面向对象编程基础.overload;

public class OverLoadExercise {
	public static void main(String[] args) {
		Methods m1 = new Methods();
		System.out.println(m1.m(4));
		System.out.println(m1.m(1,2));
		System.out.println(m1.m("shuchu"));
	}
}

class Methods {
	public int m(int a) {
		return a * a;
	}
	public int m(int a,int b) {
		return a * b;
	}
	
	public String m(String a) {
		return a;
	}
	
	
}
