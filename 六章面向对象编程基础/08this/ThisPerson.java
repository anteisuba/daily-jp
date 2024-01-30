package 面向对象编程基础.this函数;

public class ThisPerson {
	public static void main(String[] args) {
		Person p1 = new Person("yang", 30);
		Person p2 = new Person("smit",30);
		System.out.println(p1.compareTo(p2));
	}
}

class Person {
	String  name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean compareTo(Person p) {
//		if(this.name.equals(p.name) && this.age == p.age) {
//			return true;
//		} else {
//			return false;
//		}
		return this.name.equals(p.name) || this.age == p.age;
	}
}

