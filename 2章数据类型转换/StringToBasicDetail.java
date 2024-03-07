package 数据类型转换;


// 
//  演示字符串转基本数据类型的细节
//

public class StringToBasicDetail {

	public static void main(String[] args) {
		String str1 = "1234";
		
		int n1 = Integer.parseInt(str1);
		
		System.out.println(n1);
		
		char c1 = '\n'; //换行
		char c2 = '\t'; //制表位 ctrl + d
		char c3 = '\r'; //回车
		char c4 = '\\'; //输出\
		char c5 = '1';  //
		char c6 = '2';
		char c7 = '3';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		
		String book1 = " ti";
		String book2 = "long ";
		System.out.println(book1 + book2);
 		
		char m1 =  '男';
		char m2 =  '女';
		
		System.out.println(m1 + m2);
		
		double price1 = 123.56;
		double price2 = 100.11;
		
		System.out.println(price1 + price2);
		
		//要求：用变量将姓名，年龄，成绩，性别，爱好存储
		//使用+ 
		//添加适当的注释
		//添加转义字符，使用一条语句输出
		String nam = "jack";
		int age = 20;
		double score = 80.9;
		char gender = '男';
		String hobby = "打篮球";
		
		System.out.println("姓名 \t 年龄 \t 成绩 \t 性别 \t 爱好 \n" + nam + "\t" +
				           age + "\t" + score + "\t" + gender + "\t" + hobby);
		
		
		
		
		
		
		
	}
}
