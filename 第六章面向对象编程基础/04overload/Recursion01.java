package 面向对象编程基础.overload;

public class Recursion01 {
	public static void main(String[] args) {
		T t = new T();
		t.test(4);
	}
}

class T {
//	public void test(int n) {
//		if(n > 2) {
//			test(n - 1);
//		}
//		System.out.println("n =" + n);   // n= 2 ,3,4
//	}  
	public void test(int n) {
		if(n > 2) {
			test(n - 1);
		} else {
			System.out.println("n =" + n); 	  //n = 2		
		}
	}
	
	
}
