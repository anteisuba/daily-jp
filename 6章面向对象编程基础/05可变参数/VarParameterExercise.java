package 面向对象编程基础.可变参数;

public class VarParameterExercise {
	public static void main(String[] args) {
		HspMethod02 hsp = new HspMethod02();
		System.out.println(	hsp.showScore("yang", 1,2,4));
	}
}

class HspMethod02 {
	public String showScore(String nam,double... scor) {
		double arr = 0;
		for (int i = 0; i < scor.length; i++) {
			arr += scor[i];
		}
		return nam + scor.length + "成绩总分 = " + arr;
		
	}
}
