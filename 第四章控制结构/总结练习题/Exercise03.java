package 控制结构.总结练习题;
/**
 *@Author yangjian
 *@Date 2024年1月8日 下午10:16:59
 *daliy-jp 控制结构.总结练习题 Exercise03.java
 *dreamtank
 *
 */
public class Exercise03 {
	public static void main(String[] args) {
		int n = 153;
		int n1 = n /100;
		int n2 = n % 100 /10;
		int n3 = n % 10;
		if(n == n1*n1*n1 + n2*n2*n2 + n3*n3*n3 ) {
			System.out.println(n + "是水仙花数");
		} else {
			System.out.println("不是水仙花数");
		}
	}
}
