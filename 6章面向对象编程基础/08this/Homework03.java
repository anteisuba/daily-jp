package 面向对象编程基础.this函数;

public class Homework03 {
	public static void main(String[] args) {
		Book book = new Book("yang",103);
		book.info();
		book.updatePrice();
		book.info();
	}
}

class Book {
	String name;
	double price;
	public Book(String name,double price) {
		this.name = name;
		this.price = price;
	}
	public void updatePrice() { 
		//如果方法中没有price局部变量，this.price = price
		if(this.price > 150) {
			this.price = 150;
		} else if (this.price > 100) {
			this.price = 100;
		} 
	}
	
	//显示书籍情况
	public void info() {
		System.out.println("书名" + this.name + "价格" + this.price);
	}
}
