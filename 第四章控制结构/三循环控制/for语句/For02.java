package 控制结构.三循环控制.for语句;

import java.util.Iterator;

/**
 *@Author yangjian
 *@Date 2024年1月4日 下午8:30:56
 *daliy-jp 控制结构.三循环控制.for语句 For02.java
 *dreamtank
 *
 */
public class For02 {

	public static void main(String[] args) {
		
		int count = 0;  //  统计9的倍数的变量
		int sum = 0;
		int sta = 1;
		int end = 100;
		int t = 9; //倍数
		for (int i = sta; i < end; i++) {
			if(i % t == 0) {
				System.out.println("i =" + i);
				count++;
				sum += i;
			}
		}
		System.out.println("sum = " + sum);
		System.out.println("count =" + count);
		
		
		
	}
}
