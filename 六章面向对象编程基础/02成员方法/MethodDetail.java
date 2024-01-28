package 面向对象编程基础.成员方法;

public class MethodDetail {
	
	public static void main(String[] args) {
		AA arr = new AA();
		int[] resArr = arr.getSumAndSub(7,5);
		System.out.println("hewei" + resArr[0] + resArr[1]);
	}
	
	
	
}



class AA {
	public int[] getSumAndSub(int n1, int n2) {
		int[] res = new int[2];
		res[0] = n1 + n2;
		res[1] = n1 - n2;
		return res;
	}
	
	public double f1() {
		double dou = 1.1 * 3;
		return dou;
	}
	
	public void f2() {
		System.out.println("hellow");
		return;
}


	
}