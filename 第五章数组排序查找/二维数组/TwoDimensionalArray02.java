package 数组排序和查找.二维数组;
/**
 *@Author yangjian
 *@Date 2024年1月11日 下午10:06:22
 *daliy-jp 数组排序和查找.二维数组 TwoDimensionalArray02.java
 *dreamtank
 *
 */
public class TwoDimensionalArray02 {
	public static void main(String[] args) {
		//动态初始化1
		int arr[][] = new int[2][3];
		
		//动态初始化2
		int arr2[][];
		arr2 = new  int[2][3];
		
		arr[1][1] = 8;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); //换行
		}
	}
}
