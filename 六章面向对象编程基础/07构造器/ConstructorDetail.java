package 面向对象编程基础.构造器;

public class ConstructorDetail {
	public static void main(String[] args) {
		Person02 p2 = new Person02("yang");
		Dog d1 = new Dog("wucan");
	}
}

class Dog {
	
	public Dog(String dName) {
		
	}
	Dog() { //显式定义一下无参构造器才能用
		
	}
}

class Person02 {
	String name;
	int age;
	public Person02(String pName,int pAge) {
		name = pName;
		age = pAge;
		
	}
	
	public Person02(String pName) {
		name = pName;
		System.out.println("dayinyang");
	}
	
	
}