package 面向对象编程基础.作用域;

public class VarScppeDatail {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.say(); //king 当执行say方法时，say方法的局部变量name会创建，当say执行完毕后name局部变量就会销毁，但是属性仍然可以使用
		T t1 = new T();
		t1.test();
		
		t1.test2(p1);
		
	}
	
	
}

class T {
	
	//全局变量可以在本类或其他类使用
	public void test() {
		Person p2 = new Person(); //通过对象调用
		System.out.println(p2.name);
	}
	
	public void test2(Person p) {
		System.out.println(p.name);
	}
}

class Person {
	//属性可以加修饰符(public protected private)
	//局部变量不可以加修饰符
	public int age = 30;
	String name = "yang";
	
	public void say() {
		String name = "king";
		System.out.println("say()name =" + name);
	}
	
}
