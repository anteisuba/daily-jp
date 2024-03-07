package 面向对象编程基础.this函数;

public class ThisDetail {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.f2();
		c1.f3();
	}
}

class Cat {
	String name = "yang";
	int num = 30; 
	//注意this访问构造器的语法，必须置于第一条语句
	public Cat() {
		//这里去访问Cat(String name,int age) 
		this("yang" , 30);
		System.out.println("Cat()构造器");
	}
	
	public Cat(String name,int age) {
		System.out.println("Cat(String,age)构造器");
	}
	
	public void f1() {
		System.out.println("f1()方法");
	}
	
	public void f2() {
		System.out.println("f2()方法");
		//第一种方式调用f1
		f1();
		//第二种方式
		this.f1();
	}
	
	public void f3() {
		//用this访问属性
		System.out.println("name = " +  this.name + "num =" + this.num);
		
	}
	
}
