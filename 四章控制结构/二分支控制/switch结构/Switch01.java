package 控制结构.二分支控制.switch结构;

import java.util.Scanner;

// 114课
public class Switch01 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a-g）");
		char c1 = myScanner.next().charAt(0);
		//在java中，只要有值返回就是表达式
		switch(c1) {
			case 'a' :
				System.out.println("今天是周一");
			break;
			case 'b' :
				System.out.println("今天是周二");
				break;
			case 'c' :
				System.out.println("今天是周三");
				break;
			case 'd' :
				System.out.println("今天是周四");
				break;
			case 'e' :
				System.out.println("今天是周五");
				break;
			case 'f' :
				System.out.println("今天是周六");
				break;
			case 'g' :
				System.out.println("今天是周日");
				break;
			default:
				System.out.println("输入的内容不正确，无法匹配");
			
				
		}
		
		System.out.println("退出了switch，程序继续执行");
		
		
	}
}
