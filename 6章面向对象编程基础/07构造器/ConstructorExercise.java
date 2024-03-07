package 面向对象编程基础.构造器;

public class ConstructorExercise {
	public static void main(String[] args) {
		Person03 p1 = new Person03();
		Person03 p2 = new Person03("yang",90);
		System.out.println("p1的信息=" + p1.name + p1.age);
		System.out.println("p2的信息= " + p2.name + p2.age);
	}
}

class Person03 {
	int age;
	String name;
	public Person03() {
		age  = 18;
		
	}
	
	public Person03(String pName,int pAge) {
		name = pName;
		age = pAge;
	}
}
