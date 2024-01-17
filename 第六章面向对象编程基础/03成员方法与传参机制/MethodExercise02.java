package 面向对象编程基础.成员方法的传参机制;

public class MethodExercise02 {
	public static void main(String[] args) {
		//编写一个方法copyPerson，可以复制一个Person对象，返回复制对象，克隆对象
		//注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
		Person p = new Person();
		p.name = "milan";
		p.age = 100;
		
		myTools tools = new myTools();
		Person p2 = tools.copyPerson(p);
		
		//到此p和p2是Person对象，但是是两个独立的对象，属性相同
		System.out.println("p的属性 age =" + p.age + "名字" + p.name);
		System.out.println("p2的属性 age =" + p2.age + "名字" + p2.name);
		
		
	}
}

class Person {
	String name;
	int age;
	
}

class myTools {
	public Person copyPerson(Person p) {
		//创建一个新的对象
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		
		return p2;  //克隆
	}
	
	
}
