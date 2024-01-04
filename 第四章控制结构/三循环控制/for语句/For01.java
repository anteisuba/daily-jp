package 控制结构.三循环控制.for语句;

import java.util.Iterator;

/**
 *@Author yangjian
 *@Date 2024年1月2日 下午10:03:15
 *daliy-jp 控制结构.三循环控制.for语句 For01.java
 *dreamtank
 *
 */
public class For01 {

	public static void main(String[] args) {
		
		int i = 1;
		int co = 5;
		for(; i < co ;) {
			System.out.println("循環3回");
			i++; 
		}
		
//		System.out.println("i = " + i);
		
		for (int a = 0,j = 2 ;a < co;  a++, j += 2) {
			System.out.println("a = " + a + " j = " + j);
			
		}
		
//		for( ;  ; ) {   //表示一个无限循环
//			System.out.println("ok~" + (i++));
//		} 
//		
	}
}
