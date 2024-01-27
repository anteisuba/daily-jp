package 面向对象编程基础.overload;

import java.util.Scanner;

public class RecursionExercise01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		D d = new D();
		int i = myScanner.nextInt();
		System.out.println("请输入" + i);
		int res = d.fibonacci(i);
		if(res != -1) {
			System.out.println("当n= " + i +"对应的斐波那契数=" + res);
		}
		
	}
}

class D {
	//斐波那契数1，1，2，3，5，8，13  给你一个整数n，求出它的值是多少
	public int fibonacci(int n) {
		if(n >= 1) {
			if(n == 1 || n == 2) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("输入的n大于1");
			return -1;
		}
	}
	
}
