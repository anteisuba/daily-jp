package 控制结构.总结练习题;
/**
 *@Author yangjian
 *@Date 2024年1月8日 下午11:08:59
 *daliy-jp 控制结构.总结练习题 Exercise07.java
 *dreamtank
 *
 */
public class Exercise07 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i <= 100;i++) {
			for(int j = 1;j <= i; j++) {
				sum += j;
			}
		}
		System.out.println("shuchu" + sum );
	}
}
