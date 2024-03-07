package 控制结构.二分支控制;

public class If02 {

	public static void main(String[] args) {
		int x = 7;
		int y = 4;
		if(x > 5) {
			if(y > 5) {
				System.out.println(x + y);
			}
			System.out.println("双分支练习");
		} else {
			System.out.println("x is" + x);
		}
	}
	
}
