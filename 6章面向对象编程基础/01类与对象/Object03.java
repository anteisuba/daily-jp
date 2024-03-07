package 面向对象编程基础.类与对象;

public class Object03 {
	public static void main(String[] args) {
		Person01 a = new Person01();
		a.age = 10;
		a.name = "xiaoming";
		Person01 b = a;
		System.out.println(b.name);
		b.age = 200;
		b = null;
		System.out.println(a.age);
		System.out.println(b.age);
	}
}

class Person01 {
	int age;
	String name;
}

