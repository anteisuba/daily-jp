package 控制结构.三循环控制.while语句;
/**
 *@Author yangjian
 *@Date 2024年1月4日 下午9:30:53
 *daliy-jp 控制结构.三循环控制.while语句 While02.java
 *dreamtank
 *
 */
public class While02 {

	public static void main(String[] args) {
		
		int i = 1;
		while( i <= 100 ) {
			if(i % 3 == 0) {
				System.out.println("能被3整除" + i);
			}
			i++;
		}
		
		int a = 4;
		while(a <= 200) {
			if(a % 2 == 0 ) {
				System.out.println(" 偶数" + a);
				
			}
			a++;
		}
	}
}
