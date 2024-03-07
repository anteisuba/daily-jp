package 控制结构.三循环控制.while语句;
/**
 *@Author yangjian
 *@Date 2024年1月4日 下午10:09:00
 *daliy-jp 控制结构.三循环控制.while语句 Dowhile01.java
 *dreamtank
 *
 */
public class Dowhile01 {

	public static void main(String[] args) {
		
//		int i = 1;
//		do {
//			System.out.println("xunhuan");
//			i++;
//		} while (i <= 10);
//		
//		int a = 1;
//		do {
//			System.out.println(a);
//			a++;
//		}while (a <= 100);
//		
//		int b = 1;
//		int sun = 0;
//		do {
//			System.out.println(b);
//			b ++;
//			sun+= b;
//		}while(b <= 100);
//		
//		System.out.println(sun);
//		范围的值可以修改
		
		int c = 1;
		int cou = 0;
		int end = 200;
		do {
			if(c % 5 == 0 && c % 3 != 0) {
				System.out.println(c);		
				cou++;
			}
			c++;
		} while (c <= end);
		
		System.out.println("count = " + cou);
		
		
		
		
	}
}
