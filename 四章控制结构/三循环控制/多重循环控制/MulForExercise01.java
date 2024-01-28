package 控制结构.三循环控制.多重循环控制;

import java.util.Scanner;

/**
 *@Author yangjian
 *@Date 2024年1月5日 下午9:10:59
 *daliy-jp 控制结构.三循环控制.多重循环控制 MulForExercise01.java
 *dreamtank
 *
 */
public class MulForExercise01 {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		double sum = 0; //一个班级的总分
		double totalScore = 0;  //所有班级的总分
		int passNum = 0;
		int classNum = 3;
		int i = 5;
		for(int a = 1 ; a <= classNum ; a++) {  //a表示班级
			for(int j = 1; j <= i; j++) {    //j表示学生
				System.out.println("请数" + a +  "第一个班的第" + j + "个学生的成绩");
				double score = myScanner.nextDouble();
				if(score >= 60) {
					passNum++;
				}
				sum += score;
				System.out.println("成绩为" + score);
			
			}
		
			//因为sum是五个学生的总成绩
			System.out.println("sum=" + sum + "平均分=" + (sum / i)) ;
			//把sum累积到totalScore
			totalScore += sum;
			
		}
		System.out.println("三个班总分=" + totalScore + "平均分=" + totalScore / 15 );
		System.out.println("及格人数=" + passNum);
		
	}
}
