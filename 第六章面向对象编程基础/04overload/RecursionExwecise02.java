package 面向对象编程基础.overload;

public class RecursionExwecise02 {
	public static void main(String[] args) {
		Monk m1 = new Monk();
		
		int day = 1;
		int peachNum = m1.peach(day);
		if(peachNum != -1) {
			System.out.println("第"+ day +"天有" + peachNum + "个桃子");
		}
		
	}
}

class Monk {
	public int peach(int day) {
		if(day == 10) { //第十天只有一个桃子
			return 1;
		} else if ( day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.println("day在1到10内");
			return -1;
		}
		
		  
		
		
	}
	
	
}