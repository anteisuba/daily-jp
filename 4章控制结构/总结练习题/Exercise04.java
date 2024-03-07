package 控制结构.总结练习题;
/**
 *@Author yangjian
 *@Date 2024年1月8日 下午10:30:21
 *daliy-jp 控制结构.总结练习题 Exercise04.java
 *dreamtank
 *
 */
public class Exercise04 {

	public static void main(String[] args) {
		
		int count = 0;
		
		
		for(int i = 1; i <=100;i++) {
			if(i % 5 != 0) {
				count++;
				System.out.print("shuchu" + i + " \t"  );
				if(count % 5 == 0) { 
					System.out.println();   //每满五个就输出一个换行
				}
			}
		}
	}
}
