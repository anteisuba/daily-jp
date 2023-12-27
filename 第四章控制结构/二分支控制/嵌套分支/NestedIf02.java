package 控制结构.二分支控制.嵌套分支;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入月份");
		int month = myScanner.nextInt();
		
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		
		double ticketPrice = calculateTicketPrice(month,age);
		
		System.out.println("票价为 : " + ticketPrice);
		
		
	}
	
	public static double calculateTicketPrice(int month,int age) {
		double ticketPrice;
		if(month >= 4 && month <= 10) {
			if(age >= 18 && age <= 60) {
				ticketPrice = 60;
			} else if (age < 18) {
				ticketPrice = 60 / 2.0;
			} else {
				ticketPrice = 60 / 3.0;
			}
		} else {
			if ( age >= 18 && age <= 60) {
				ticketPrice = 40;
			} else {
				ticketPrice = 20;
			}
		}
		return ticketPrice;
		
		
	}
}
