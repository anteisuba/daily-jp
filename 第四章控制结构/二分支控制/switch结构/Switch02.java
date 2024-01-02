package 控制结构.二分支控制.switch结构;

public class Switch02 {
	public static void main(String[] args) {
		//表达式的数据类型，应和case后的常量类型一致
		
		char c = 'a';
		switch(c) {
		case 'a' :
			System.out.println("ok1");
			break;
//		case "hello" :
//			System.out.println("类型不一致");
//			break;
		case 20 :
			System.out.println("char可以转换成int类型");
			break;
		case '2' :
			System.out.println("也可以转换");
			break;
		default :
			System.out.println("返回 ");
//		switch表达式中的返回值必须是：（byte short int char enum[枚举] String）
			
//		case子句中的值必须是常量（‘a’，1）或者是常量表达式，而不能是变量 （a）	
	
//      default是可选的，当没有匹配的case时，执行default。
			
//      break语句用来在执行完一个case分支后使程序跳出switch语句块
			
		}
		
		
	}
}
