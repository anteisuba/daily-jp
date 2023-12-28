package 数据类型转换;

public class StringToBasic {

	public static void main(String[] args) {
		
		//基本数据类型转String
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s5 = f1 + "";

		String s2 = d1 + "";

		String s3 = b1 + "";

		String s4 = n1 + "";

		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s4);
		System.out.println(s3);
				
		//String转对应的基本数据类型
		String s6 = "12345";
		int num1 = Integer.parseInt(s6);
		
		String s7 = "12.2";
		double num2 = Double.parseDouble(s7);
		
		
 		
		System.out.println(num1);
		System.out.println(num2);
			
		
		
		
		
	}
}
