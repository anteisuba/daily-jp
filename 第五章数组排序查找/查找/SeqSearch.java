package 数组排序和查找.查找;

import java.util.Scanner;

/**
 *@Author yangjian
 *@Date 2024年1月11日 下午9:21:52
 *daliy-jp 数组排序和查找.查找 SeqSearch.java
 *dreamtank
 *
 */
public class SeqSearch {
	public static void main(String[] args) {
// 顺序查找
		String[] arr = {"bai","jin","zi","qing"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String findName = myScanner.next();
		
		int index = -1;  //用索引或标识符记录
		for(int i = 0 ; i < arr.length;i++)  {
			//字符串的比较 equals
			if(findName.equals(arr[i])) {
				System.out.println("zhaodao" + findName);
				System.out.println("xiabiaowei" + i);
				index = i;
				break;
			} 
			
		}
		
		if(index == -1) {
			System.out.println("meiyouzhaodao" + findName);
		}
		
	}
}
