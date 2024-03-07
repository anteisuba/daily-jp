package 面向对象编程基础.成员方法;

public class MethodParameter01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		CC c = new CC();
		c.swap(a ,b);
		System.out.println("a =" + a + "b = " + b);
		
	}
}

class CC {
	public void swap(int a,int b) {
		System.out.println("a和b交换前的值=a" + a + "b=" + b);
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a =" + a + "b=" + b);
	}
}