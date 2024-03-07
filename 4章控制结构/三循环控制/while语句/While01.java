package 控制结构.三循环控制.while语句;
/**
 *@Author yangjian
 *@Date 2024年1月4日 下午9:15:40
 *daliy-jp 控制结构.三循环控制.while语句 While01.java
 *dreamtank
 *
 */
public class While01 {
	public static void main(String[] args) {
		int i = 1; //循环初始化
		while(i <= 10) { //循环条件
			System.out.println("while 循环"); //执行语句
			i++;  //循环变量迭代
		}
		
		System.out.println("退出whlie，继续执行" + i);
	}
}
