package 三元运算符;

public class Tennary {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		
		int result = a > b ? a++ : b--;
		//99
		int res2 = a > b ? a++ : --b;
		//97
		System.out.println("result" + result);
		System.out.println("res2" + res2);
		
	}
}