package 控制结构.Break;

import java.util.Scanner;

/**
 *@Author yangjian
 *@Date 2024年1月6日 下午9:55:00
 *daliy-jp 控制结构.Break BreakExercise.java
 *dreamtank
 *
 */
public class BreakExercise {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1 ; i <= 100;i++) {
			sum += i;
			if(sum > 20) {
				System.out.println("当前数为：" + i);
				break;
			}
		}
		
		Scanner myScanner = new Scanner(System.in);
		
		
		String nam = " ";
		String pass = "";
		int chance = 3;  
		
		
		for(int a = 0; a <= 3; a++) {
			System.out.println("请输入名字");
			nam = myScanner.next();
			System.out.println("请输入密码");
			pass = myScanner.next();
			//字符串比较的方法是 equals，举例：
//			String name = "lin";
//			System.out.println(name.equals("lin"));
//			System.out.println("lin".equals(name));  //推荐 可以避免空指针
			if("丁真".equals(nam) && "666".equals(pass) ) {
				System.out.println("登陆成功");
				break;
			} else {
				System.out.println("登陆不成功");
			}
			chance--;
			System.out.println("你还有" + chance + "次登陆机会");
			
		}
		
		
		
	}
}
