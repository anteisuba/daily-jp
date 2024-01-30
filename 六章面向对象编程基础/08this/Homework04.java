package 面向对象编程基础.this函数;

public class Homework04 {
	public static void main(String[] args) {
		int[] oldArr = {1,2,3,4}; 
		A04 a04 = new A04();
		int[] newArr = a04.copyArr(oldArr);
		//遍历newArr，验证
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}
		
	}
}

class A04 {
	 
	
	public int[] copyArr(int[] oldArr) {
		//在堆中创建一个长度为oldArr.length数组
		int[] newArr = new int[oldArr.length];
		
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		
		return newArr;
		
	}
}
