package 控制结构.二分支控制.switch结构;

import java.util.Scanner;

/**
 *@Author yangjian
 *@Date 2024年1月2日 下午8:58:07
 *daliy-jp 控制结构.二分支控制.switch结构 Switch03.java
 *dreamtank
 *
 */
public class Switch03 {

	public static void main(String[] args) {
		
		  
//		Scanner myScanner = new Scanner(System.in);
//		System.out.println("将小写字母转换成大写");
//		char c1 = myScanner.next().charAt(0);
//		
//		switch(c1) {
//		case 'a' :
//			System.out.println('A');
//			break;
//		case 'b' :
//			System.out.println('B');
//			break;
//		case 'c' :
//			System.out.println('C');
//			break;
//		case 'd' :
//			System.out.println('D');
//			break;
//		default :
//			System.out.println("你的输入有误");
//		}
		
//		
//		Scanner myScanner = new Scanner(System.in);
//		System.out.println("请输入你的成绩");
//		double score = myScanner.nextDouble();
////		double score = 90;
//		
//		if(score >= 0 && score <= 100) {
//			switch((int)(score / 60)) {
//			case  0 :
//				System.out.println("不及格");
//				break;
//			case 1 :
//				System.out.println("合格");
//				break;
//			default :
//				System.out.println("输入不正确");
//			}
//		} else {
//			System.out.println("成绩范围在1-100");
//		}
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = myScanner.nextInt();
		
		switch(month) {
			case 3,4,5 :
				System.out.println("春季");
				break;
			case 6,7,8 :
				System.out.println("夏季");
				break;
			case 9,10,11 :
				System.out.println("秋季");
				break;
			case 12,1,2 :
				System.out.println("春季");
				break;
			default :
				System.out.println("请输入正确的月份");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
