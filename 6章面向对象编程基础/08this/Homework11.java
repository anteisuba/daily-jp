package 面向对象编程基础.this函数;

public class Homework11 {
	
	
	public static void main(String[] args) {
		
	}
}

class Demo {
	int i = 100;
	public void m() {
		int j = i++;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
	}
}

class Test {
	public static void main(String[] args) {  //运行
		Demo d1 = new Demo();
		Demo d2 = d1;
		d2.m();
		System.out.println(d1.i);
		System.out.println(d2.i);

	}
}





