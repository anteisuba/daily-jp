package 数组排序和查找.Array;
/**
 *@Author yangjian
 *@Date 2024年1月9日 下午11:20:58
 *daliy-jp 数组排序和查找.Array ArrayExercise01.java
 *dreamtank
 *
 */
public class ArrayExercise01 {
	public static void main(String[] args) {
		char n1[] = new char[26];
		for(int i = 0; i < n1.length; i++) {
			n1[i] = (char)('A' + i);
		}
		
		System.out.println(n1);
		for(int i = 0;i < n1.length;i++) {
			System.out.print(n1[i] + " ");
		}
	}
}
