package 面向对象编程基础.成员方法;

public class MethodDetail02 {
	public static void main(String[] args) {
		A a = new A();
		
		a.sayOK();
		a.m1();
	}
}

class A {
	//同一个类中的方法直接调用
	public void print(int n) {
		System.out.println("print 方法被调用" + n);
	}
	
	public void sayOK() {
		print(10);
	}
	
	public void m1() {
		//创建一个B的对象
		B b = new B();
		b.Hi();
	}
}

class B {
	public void Hi() {
		System.out.println("B类中的hi被执行");
	}
}