package 数组排序和查找.Array;
/**
 *@Author yangjian
 *@Date 2024年1月9日 下午9:36:47
 *daliy-jp 数组排序和查找.Array Array01.java
 *dreamtank
 *
 */

//引出数组
//定义一个数组

public class Array01 {
	public static void main(String[] args) {
		//[]表示是double类型的数组
		double[] hens = {3,5,1,3.4,2,50};
		String[] n1 = {"yan","jian","yi","ning" };
		//数组可以用for循环遍历，得到数组所有元素的和
		//1 可以通过hens[下标]来访问数组的元素，
		//2  通过for就可以循环访问 数组的元素/值
		//3 使用一个变量 将各个元素累积
		
		double totalWeight = 0;
		//在java中可以通过数组名.length得到数组的大小/长度
		int num = hens.length;
		for(int i = 0; i < num; i++) {
			System.out.println("第"+ (i+1) +"个元素的值" + hens[i]);
			totalWeight += hens[i];
			
		}
		
		System.out.println("总体重= " + totalWeight + "平均体重=" + (totalWeight / num));
		
		
		
		
		
		
	}
}
