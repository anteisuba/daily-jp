package 控制结构.三循环控制.多重循环控制;
/**
 *@Author yangjian
 *@Date 2024年1月5日 下午10:28:56
 *daliy-jp 控制结构.三循环控制.多重循环控制 Work01.java
 *dreamtank
 *
 */
public class Work01 {

	public static void main(String[] args) {
		//打印出九九乘法表
		for(int i = 1; i <= 9;i++) {
			for(int j = 1 ; j <= 9; j++ ) {
				System.out.println(i + " * " + j + " = " + (i * j) + "\t" );
			}
			System.out.println( );
		}
	}
}
