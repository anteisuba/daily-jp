package 数组排序和查找.Array;
/**
 *@Author yangjian
 *@Date 2024年1月10日 下午10:19:03
 *daliy-jp 数组排序和查找.Array ArrayAdd.java
 *dreamtank
 *
 */
public class ArrayAdd {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		//定义一个新的数组 int[] arrNew = new int[arr.length + 1]
		//遍历arr数组，依次将arr的元素拷贝到arrNew数组
		//将4赋给arrNew[arr.length - 1] = 4;
		//让arr指向arrNew
		
		int[] arrNew = new int[arr.length+1];
		
		
		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		arrNew[arrNew.length  - 1] = 4;
		arr = arrNew;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
}
