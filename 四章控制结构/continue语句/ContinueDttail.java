package 控制结构.continue语句;
/**
 *@Author yangjian
 *@Date 2024年1月6日 下午11:04:48
 *daliy-jp 控制结构.continue语句 ContinueDttail.java
 *dreamtank
 *
 */
public class ContinueDttail {

	public static void main(String[] args) {
		label1:
			for(int j = 0;j < 4;j++) {
				label2:
					for(int i = 0;i < 10 ;i++) {
						if(i == 2) {
							continue label1;
						}
						System.out.println("i = " + i);
					}
			}
	}
}
