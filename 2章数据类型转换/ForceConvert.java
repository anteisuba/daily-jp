package 数据类型转换;

public class ForceConvert {

	public static void main(String[] args) {
//		演示强制类型转换
		
		int n1 = (int)1.9;
		System.out.println("n1 = " + n1);
		
		int n2 = 2000;
		byte b1 = (byte)n2; //造成精度损失
		
		System.out.println("b1 = " + b1); //-48 造成数据溢出
		
		
		int x = (int)(10*3.5 + 6*1.5);   //强转只针对最近的操作数有效
		System.out.println("x :" + x);
		
		//char可以保存int的常量值，但不能保存int的变量值，需要强转
		
		char c1 = 100;
		int m = 100;
//		char c2 = m;  //错误
		char c3 = (char)m;
		System.out.println(c3);
		
		
		
	}
}
