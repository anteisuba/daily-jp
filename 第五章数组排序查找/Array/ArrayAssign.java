package 数组排序和查找.Array;
/**
 *@Author yangjian
 *@Date 2024年1月10日 下午5:25:04
 *daliy-jp 数组排序和查找.Array ArrayAssign.java
 *dreamtank
 *
 */

//数组赋值机制
public class ArrayAssign {
	public static void main(String[] args) {
		//基础数据类型赋值
		int n1 = 10;
		int n2 = n1;
		n2 = 80;
		
		 //数组 在默认情况下是引用传递，赋的值是地址，赋值方式为引用赋值
		//是一个地址，arr2变化会影响到arr1
		int[] arr1 = {1 ,2 , 3};
		int[] arr2 = arr1;
		arr2[0] = 10;
		System.out.println("arr1的元素");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]); //10 2 3 
		}
		
	}
}
