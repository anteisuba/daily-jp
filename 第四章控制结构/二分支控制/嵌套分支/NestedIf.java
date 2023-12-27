package 控制结构.二分支控制.嵌套分支;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("输入成绩");
		
		
		double score = myScanner.nextDouble();
		
		
		if(score > 8.0) {
			System.out.println("进入决赛,请输入性别");
			char gender = myScanner.next().charAt(0);
			if( gender == '男' ) {
				System.out.println("进入男子组");
			} else if(gender == '女') {
				System.out.println("进入女子组");
			} else {
				System.out.println("性别有误");
			}
			
			
		} else {
			System.out.println("淘汰");
		}
		
		
		
		
	}
}
