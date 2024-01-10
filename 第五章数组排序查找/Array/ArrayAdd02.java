package 数组排序和查找.Array;

import java.util.Scanner;

/**
 *@Author yangjian
 *@Date 2024年1月10日 下午10:54:07
 *daliy-jp 数组排序和查找.Array ArrayAdd02.java
 *dreamtank
 *
 */
public class ArrayAdd02 {
	
		public static void main(String[] args) {
			Scanner myScanner = new Scanner(System.in);
			
			int[] arr = {1,2,3};
			//定义一个新的数组 int[] arrNew = new int[arr.length + 1]
			//遍历arr数组，依次将arr的元素拷贝到arrNew数组
			//将4赋给arrNew[arr.length - 1] = 4;
			//让arr指向arrNew
			//创建一个Scanner接受用户输入
			do {
				
				int[] arrNew = new int[arr.length+1];			
				for (int i = 0; i < arr.length; i++) {
					arrNew[i] = arr[i];
				}
				System.out.println("请输入你要添加的元素");
				int addNum = myScanner.nextInt();
				arrNew[arrNew.length  - 1] = addNum;
				arr = arrNew;
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + "\t");
				}
				//问用户是否继续添加
				System.out.println("是否继续添加 y/n");
				char key = myScanner.next().charAt(0);
				if(key == 'n') { //如果输入n就提前技术
					break;
				} 
				
			}while(true);
			System.out.println("你退出了程序");
		}
}
