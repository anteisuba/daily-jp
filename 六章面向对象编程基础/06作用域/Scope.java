package 面向对象编程基础.作用域;


public class Scope {
	public static void main(String[] args) {
		
	}
}

class Cat {
	//属性在定义时可以直接赋值，age是全局变量
	int age = 20;
	double weight; //全局变量有默认值
	
	
	public void say() {
		
		//局部变量：成员方法中定义的变量
		//n和name就是局部变量
		//n和name的作用域在cry方法中
		int n = 10; //局部变量必须赋值才能使用，没有默认值
		String name = "jack";
		System.out.println("在say中使用属性 age=" + age);
	}
	public void eat() {
		System.out.println("在eat中使用属性 age =" + age);
		
		System.out.println("在eat中使用say的变量，不可以");
	}
}
