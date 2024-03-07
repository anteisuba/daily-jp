package 面向对象编程基础.可变参数;

public class VarParameterDatail {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		T t1 = new T();
		t1.f1(arr);
		
	}
}

class T {
	public void f1(int... nus) {
		System.out.println("长度=" + nus.length);
	}
	
	//可变参数放在最后
	public void f2(String str,double... nums) {
		
	}
	
	//可变参数只能有一个
	public void f3(String str,double... nums) {
		
	}
}
