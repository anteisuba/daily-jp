package 控制结构.二分支控制;

import java.util.Scanner;

public class IfelseExercise {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入信用分（1-100）：");
		
		int xinyong = myScanner.nextInt();
		
		if(xinyong >= 1 && xinyong <= 100) {
			if(xinyong == 100) {
				System.out.println("信用极好");
			} else if (xinyong > 80 && xinyong < 99) {
				System.out.println("信用优秀");
			} else if (xinyong > 60 && xinyong < 80) {
				System.out.println("信用一般");
			} else {
				System.out.println("不及格");
			}
			
		} else {
			System.out.println("信用分需要在1-100，请重新输入：");
		}
		
		
		
	}
	
}
