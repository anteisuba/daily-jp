package 结构控制.return语句;
/**
 *@Author yangjian
 *@Date 2024年1月8日 下午9:16:34
 *daliy-jp 结构控制.return语句 Return01.java
 *dreamtank
 *
 */
public class Return01 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5 ; i++) {
			if(i == 3) {
				System.out.println("dayin");
//			break;		 //hello hello dayin go on
//			continue;  //hello dayin hello hello go on
//			return;   	//hello hello dayin
			}
			System.out.println("hello");
			
		}
		System.out.println("go on");
	}
}
