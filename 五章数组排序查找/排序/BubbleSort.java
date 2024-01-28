package 数组排序和查找.排序;
/**
 *@Author yangjian
 *@Date 2024年1月11日 下午8:20:21
 *daliy-jp 数组排序和查找.排序 BubbleSort.java
 *dreamtank
 *
 */
//冒泡排序

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {24,69,80,57,13,-1,30,200};
		
		int temp = 0; //用于辅助交换的变量
		
		for(int i = 0 ; i < arr.length -1 ; i++) { //外层循环4次
			for (int j = 0; j < arr.length - 1 - i ; j++) {  
				//如果前面的数大于后面的数，就交换
				if(arr[j] > arr[j+1] ) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
				}		
			}
			System.out.println("\n==第"+ (i+1)+"一轮==");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t");
			}
		}
		
		
	}
}
