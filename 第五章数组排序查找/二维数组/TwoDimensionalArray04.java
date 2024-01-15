package 数组排序和查找.二维数组;
/**
 *@Author yangjian
 *@Date 2024年1月11日 下午10:55:17
 *daliy-jp 数组排序和查找.二维数组 TwoDimensionalArray04.java
 *dreamtank
 *
 */
public class TwoDimensionalArray04 {
	public static void main(String[] args) {
		int arr[][] = {{4,6},{1,4,5,7},{-2}};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				
				
			}
		}
		System.out.println("sum=" + sum);
		
	}
}
