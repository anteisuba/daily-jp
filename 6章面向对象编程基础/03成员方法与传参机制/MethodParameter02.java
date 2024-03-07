package 面向对象编程基础.成员方法;

public class MethodParameter02 {
	public static void main(String[] args) {
		DD b = new DD();
		int[] arr = {1,2,3};
		b.test100(arr);
		//遍历数组
		System.out.print("这是main的数组");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		//测试
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		b.test200(p);
		System.out.println("main的p.age=" + p.age);
	}
}
class Person {
	String name;
	int age;
}


class DD {
	
	public void test200(Person p) {
			// p.age = 10000;
			//p = null;
			p = new Person();
			p.name = "tom";
			 p.age = 99;
			 System.out.println("test200的p=" + p.name);
			
	}
	
	public void test100(int[] arr) {
		arr[0] = 200; //修改了元素
		//遍历数组
		System.out.println("这是test100的数组");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
	}
}
