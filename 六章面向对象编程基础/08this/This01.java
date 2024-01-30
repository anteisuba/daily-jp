package 面向对象编程基础.this函数;

public class This01 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("da", 3);
		dog1.info();
		
	}
}

class Dog {
	String name;
	int age;
//	public Dog(String dName, int dAge) {
//		name = dName;
//		age = dAge;
//	}
	
	
	public Dog(String name,int age) { //构造器
		//this是当前对象的属性
		this.name = name;
		this.age = age;
	}
	
	
	public void info() { //成员方法
		System.out.println(name + "\t" + age + "\t");
	}
}