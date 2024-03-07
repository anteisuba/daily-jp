package 面向对象编程基础.this函数;

public class Homework07 {
	public static void main(String[] args) {
		Dog d1 = new Dog("yang", "yellow", 24);
		d1.show();
	}
}

class Dog {
	String name;
	String color;
	int age;
	public Dog(String name,String color,int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
	}
	
	
}