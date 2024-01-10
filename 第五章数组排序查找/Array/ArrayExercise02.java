package 数组排序和查找.Array;
/**
 *@Author yangjian
 *@Date 2024年1月10日 下午5:03:12
 *daliy-jp 数组排序和查找.Array ArrayExercise02.java
 *dreamtank
 *
 */
public class ArrayExercise02 {
	public static void main(String[] args) {
		int n1[] = {4,-1,9,10,23};
		int max = n1[0];
		int maxIndex = 0;
		for(int i = 1; i < n1.length; i++) {
			if(max < n1[i]) {
				max = n1[i];
				maxIndex = i;
			}
		}
		System.out.println("max=" + max + maxIndex);
	}
}
