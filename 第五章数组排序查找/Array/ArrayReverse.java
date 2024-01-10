package 数组排序和查找.Array;
/**
 *@Author yangjian
 *@Date 2024年1月10日 下午9:23:41
 *daliy-jp 数组排序和查找.Array ArrayReverse.java
 *dreamtank
 *
 */

//
public class ArrayReverse {
	public static void main(String[] args) {
		//数组反转1
//		int[] arr = {11,22,33,44,55,66};
//		for(int i = 0; i < arr.length / 2 ; i++) {
//			int temp = arr[arr.length - 1 - i];
//			arr[arr.length - 1 - i] = arr[i]; //arr[5] = arr[0]
//			arr[i] = temp;  //arr[0] = arr[5]
//		}
//		
//		System.out.println("====反转后的数组");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + "\t");
//		}
		
		//数组反转2
		int[] arr = {11,22,33,44,55,66};
		int[] arr2 = new int[arr.length];
		for (int i = arr.length - 1, j = 0;i >= 0 ; i--,j++) { //逆序遍历arr
			arr2[j ] = arr[i];
		}
		
		//当for循环结束后，arr2就是一个逆序的输出 66，55，44，33，22，11
		//让arr指向arr2数据空间，此时arr原来的数据空间就没有变量引用，会被当作垃圾销毁
		arr = arr2;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
}
