package 控制结构.总结练习题;
/**
 *@Author yangjian
 *@Date 2024年1月8日 下午9:30:34
 *daliy-jp 控制结构.总结练习题 Exercise01.java
 *dreamtank
 *
 */
public class Exercise01 {

	public static void main(String[] args) {
		double salay = 100000;
		int count = 0;
		while(true) {
			if(salay > 50000) {
				salay *= 0.95;
				count++;
			} else if (salay <=50000 && salay >= 1000) {
				salay -= 1000;
				count++;
			} else {
				break;
			}
		}
		
		System.out.println(" 经过路口的次数为" + count);
		
	}
}
