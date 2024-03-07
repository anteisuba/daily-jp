package 控制结构.continue语句;
/**
 *@Author yangjian
 *@Date 2024年1月6日 下午10:50:42
 *daliy-jp 控制结构.continue语句 Continue01.java
 *dreamtank
 *
 */
public class Continue01 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 4 ) {
			i++;
			if(i == 2) {
				continue;
			}
			System.out.println("i=" + i);
		}
	}
}
