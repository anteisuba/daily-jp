package 三元运算符;

public class Exercise {
 public static void main(String[] args) {
	int a = 3;
	int b = 33;
	int c = 44;
	//比较以上三个数的最大值
	int max1 = a > b  ? a : b;
	int max2 = max1 > c ? max1 : c;
	
	
	System.out.println("max为" + max2);
	
	
	
}
}
