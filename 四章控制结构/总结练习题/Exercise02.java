package 控制结构.总结练习题;

import java.util.Scanner;

/**
 *@Author yangjian
 *@Date 2024年1月8日 下午10:08:20
 *daliy-jp 控制结构.总结练习题 Exercise02.java
 *dreamtank
 *
 */
public class Exercise02 {

	public static void main(String[] args) {
		
//		Scanner myScanner = new Scanner(System.in);
//			System.out.println("shurushuzi");
//		int a = myScanner.nextInt();
//		if( a > 0) {
//			System.out.println("dayu0");
//		} else if (a <0) {
//			System.out.println("xiaoyu0");
//		} else {
//			System.out.println("dengyu0");
//		}
		
	//判断一个年份是否为闰年
		Scanner myScanner = new Scanner(System.in);
		int year = myScanner.nextInt();
		System.out.println("shuruninafen");
		if(year % 4 == 0) {
			System.out.println("weirunnina");
		} else {
			System.out.println("bushirunnina");
		}
		
		
		
		
		
		
	}
}
