package 数组排序和查找.二维数组;
/**
 *@Author yangjian
 *@Date 2024年1月11日 下午10:30:02
 *daliy-jp 数组排序和查找.二维数组 TwoDimensionalArray03.java
 *dreamtank
 *
 */
//动态初始化-列数不确定
public class TwoDimensionalArray03 {
	public static void main(String[] args) {
		int arr[][] = new int[3][];   //创建 二维数组，但是只确定一维数组的个数
		for (int i = 0; i < arr.length; i++) {
			//给每个一维数组开空间，new(非常重要)
			//如果没有给一维数组new，那么arr[i] 就是null
			arr[i] = new int[i + 1];
			//遍历一维数组，并给一维数组的每个元素赋值
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i+1;
				
			}
			
			
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		
		
	}
}
