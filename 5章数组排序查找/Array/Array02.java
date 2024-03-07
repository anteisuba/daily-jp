package 数组排序和查找.Array;

import java.util.Scanner;

/**
 *@Author yangjian
 *@Date 2024年1月9日 下午10:16:59
 *daliy-jp 数组排序和查找.Array Array02.java
 *dreamtank
 *
 */
public class Array02 {
	public static void main(String[] args) {
		//动态初始化1
		
		double n1[] = new double[5];
		Scanner myScanner = new Scanner(System.in);
		
		for(int i = 0; i < n1.length;i++) {
			System.out.println("请输入第"+ (i + 1) +"个元素的值");
			n1[i] = myScanner.nextDouble();
			
		}
		//输出 遍历数组 
		System.out.println("当前数组的情况如下");
		for(int i = 0; i < n1.length;i++) {
			System.out.println("第"+ (i + 1 ) +"个元素的值" + n1[i]);
		}
		
		System.out.println("========");
		//动态初始化2
		int n2[];  //声明数组，这是n2是null
		
		n2 = new int[10]; //分配内存空间，可以存放数据
		
		//静态初始化
		int n3[] = {1,3,4,5,7,4};
		
		
		
		
		
		
	}
}
