package 面向对象编程基础.this函数;

public class Homework01 {
	public static void main(String[] args) {
		A01 a = new A01();
		double[] arr = {144,55,33};
		Double res = a.max(arr); 
		if(res != null) {
			System.out.println("arr的最大值=" + a.max(arr));
		} else {
			System.out.println("输入有误");
		}
	}
}

class A01 {
	
	//Double就可以返回null
	public Double max(double[] arr) {
		
		if(arr != null && arr.length > 0) {
			double max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			return max;
		} else {
			return null;
		}
	}
}
