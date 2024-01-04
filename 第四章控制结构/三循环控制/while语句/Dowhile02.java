package 控制结构.三循环控制.while语句;

import java.util.Scanner;

/**
 *@Author yangjian
 *@Date 2024年1月4日 下午11:02:22
 *daliy-jp 控制结构.三循环控制.while语句 Dowhile02.java
 *dreamtank
 *
 */
public class Dowhile02 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		char answer = ' ';
		
		do {
			System.out.println("还钱吗");
			answer = myScanner.next().charAt(0);
			System.out.println("回答是" + answer);
		} while (answer != 'y');
		
		
		
	}
}
