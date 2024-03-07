package 控制结构.二分支控制;

public class IfExercise01 {
	public static void main(String[] args) {
		
		double a = 110;
		double b = 10;
		
		if(a > 10 && b <20) {
			System.out.println(a + b);
			
		}
		
		int c = 4;
		int d = 8;
		int e = c + d;
		if(e % 3 == 0 && e % 5 == 0) {
			System.out.println("可以被3和5整除");
		} else {
			System.out.println("不可以被3和5整除");
		}
		
		int f = 2023;
		if(f % 4 == 0 && f % 100 != 0) {
			System.out.println("是闰年");
		} else if(f % 400 == 0) {
			System.out.println("也是闰年");
		} else {
			System.out.println("不是闰年");
		}
		
		
	}
}
