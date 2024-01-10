package 数组排序和查找.Array;
/**
 *@Author yangjian
 *@Date 2024年1月10日 下午9:10:12
 *daliy-jp 数组排序和查找.Array ArrayCopy.java
 *dreamtank
 *
 */
//拷贝数组，并且数据空间是独立的

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30};
		
		//先创建一个新的数组arr2，开辟一个新的数据空间
		//大小 arr1.length
		int[] arr2 = new int[arr1.length];
		
		//遍历arr1，把每个元素拷贝到arr2对应的元素
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			
		}
		
		arr2[0] = 100;
		arr2[1] = 30;
		
		//修改arr2不会对arr1有影响
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
}
