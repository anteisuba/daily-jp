package 面向对象编程基础.类与对象;

public class Method01 {
	public static void main(String[] args) {
		//方法使用
		//方法写好后，如果不去调用，则不会输出
		//先创建对象，然后调用方法即可
		
		Person02 p2 = new Person02();
		p2.speak();
		
		p2.ca101();
		
		p2.ca102(1000);
		
	}
}

class Person02 {
	String name;
	int age;
	
	//添加方法
	//public 表示方法是公开的
	//void 表示方法没有返回值
	//speak  是方法名 （）形参列表
	// {} 方法体，写执行的代码
	public void speak() {
		System.out.println("我是");
	}
	public void ca101() {
		int sub = 0;
		for(int i = 1; i <= 1000;i++) {
			sub += i;
		}
		System.out.println("i的值为" + sub);		
	}
	
	//int n 是形参列表，可以接收用户输入
	public void ca102(int n) {
		int res = 0;
		for(int i = 0;i <=  n ; i++) {
			res += i;
			
		}
		
		System.out.println("合为" + res);
	}
	
	//pubic 表示方法是公开的
	//int表示方法执行后，返回一个int数据
	//getSum 方法名
	//inr num1,int num2是形参列表，可以接收用户传入的两个数
	
	
	public int getSum(int num1,int num2) {
		int res02 = num1 + num2;
		return res02;
	}
	
	
	
}
