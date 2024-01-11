package 数组排序和查找.二维数组;
/**
 *@Author yangjian
 *@Date 2024年1月11日 下午9:39:38
 *daliy-jp 数组排序和查找.二维数组 TwoDimensionalArray01.java
 *dreamtank
 *
 */
public class TwoDimensionalArray01 {
	public static void main(String[] args) {
		//二维数组：
		//1 从定义形式上看 int[][]
		//2 相当于原来的一维数组的每个元素是一维数组，就构成了二维数组
		int[][] arr = {{0,0,0,0,0,},
								{0,0,1,0,0},
								{0,2,0,3,0},
								{0,0,0,0,0}};
		
		System.out.println("二维数组的元素个数=" + arr.length);
		//二维数组的每个元素是一维数组，所以如果要得到每个一维数组的值还需要再次遍历
		//如果我们要访问第(i+1)个一维数组的第(j+1)个值。，arr[i][j]
		//访问3的话，他是第三个一维数组的第四个值 arr[2][3];
		
		for(int i = 0;i < arr.length;i++) { //遍历二维数组的每个元素
			//遍历二维数组的每一个元素（数组）
			//1 arr[i] 表示二维数组的第i+1个元素
			//1 arr[i].length 得到对应的每个一维数组的长度
			for(int j = 0 ; j < arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();  //换行
		}
		
	}
}
