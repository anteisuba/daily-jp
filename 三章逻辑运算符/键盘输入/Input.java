package 键盘输入;

import java.util.Scanner;  //把java。unil下面的

public class Input {
	public static void main(String[] args) {
		//演示接受用户的输入
		//Scanner类表示简单的文本扫描器，在java.util包
		//步骤 1 引入Scanner类所在的包
		//2 创建Scanner对象,new创建一个对象，
		//3 接受用户的输入，使用相关的方法
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String name = scanner.next();  //接受用户的输入
		
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		
		System.out.println("请输入薪水");
		double salary = scanner.nextDouble();

		System.out.println("人的信息如下：");
		
		System.out.println("name = " + name + "age = " + age + "salary = " + salary);
		
		
	}
}
