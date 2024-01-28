package 面向对象编程基础.overload;

public class Recursion02 {
	public static void main(String[] args) {
		R t1 = new R();
		int res = t1.factorial(5);
		System.out.println("res = " + res);
	}
}

class R {
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
}
