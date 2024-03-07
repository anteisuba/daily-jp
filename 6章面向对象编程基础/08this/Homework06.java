package 面向对象编程基础.this函数;

public class Homework06 {
	public static void main(String[] args) {
		Cale cale = new Cale(10, 0);
		System.out.println(cale.sum());
		System.out.println(cale.mins());
		System.out.println(cale.mul());
		Integer divres = cale.div();
		if (divres != null) {
			System.out.println(divres);
		}
		
	}
}

class Cale {
	int a;
	int b;
	public Cale(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return a + b;
	}
	
	public int mins() {
		return a - b; 
	}
	
	public int mul() {
		return a * b;
	}
	
	public Integer div() {
		if( b == 0) {
			System.out.println("不能为0");
			return null;
		}else {
			return a / b;
			
		}
	}
	
	
}
