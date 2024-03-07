package 面向对象编程基础.this函数;

public class Homework08 {  //公有类  
	int count = 9;  //属性
	public void count1() {  //方法1
		count = 10;  //属性
		System.out.println("count1=" + count);  //10
	}
	public void count2() {  //方法2
		System.out.println("count1=" + count++); //先输出再自增
	}
	public static void main(String[] args) {
		new Homework08().count1();  //new homework()是匿名对象 ,但是只能用一次 ，用完后被销毁
		Homework08 t1 = new Homework08();
		t1.count2();    //9
		t1.count2();   //10
		 
	}
}


