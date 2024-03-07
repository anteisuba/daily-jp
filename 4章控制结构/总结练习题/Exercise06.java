package 控制结构.总结练习题;
/**
 *@Author yangjian
 *@Date 2024年1月8日 下午10:52:34
 *daliy-jp 控制结构.总结练习题 Exercise06.java
 *dreamtank
 *
 */
public class Exercise06 {

	public static void main(String[] args) {
		double sum = 0;
		for(int i = 1;i <= 100; i++) {
			if(i % 2 != 0) {
				sum += 1.0/i;  //分子为小数才能显示正常的结果
			} else {
				sum -= 1.0/i;
			}
		}
		
		System.out.println("jieguo" + sum);
	}
}
