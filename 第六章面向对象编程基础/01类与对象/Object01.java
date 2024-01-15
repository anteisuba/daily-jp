package 面向对象编程基础.类与对象;

public class Object01 {
	public static void main(String[] args) {
		 
		//使用OOP面向对象解决
		//第二部，实例化,创建对象
		Cat cat1 = new Cat();
		cat1.name = "xiaobai";
		cat1.color = "baise";
		cat1.age = 3;
		
		Cat cat2 = new Cat();
		cat2.name = "xiaohua";
		cat2.age = 100;
		cat2.color = "huase";
		 
		System.out.println("第一只猫的信息" + cat1.name + cat1.age);
		
	}
}

//第一步，定义类
class Cat {
	//属性
	String name;
	int age;
	String color;

}

