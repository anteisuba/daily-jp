package 面向对象编程基础.成员方法;

public class MethodExercise01 {
	public static void main(String[] args) {
		BB b = new BB();
		b.a(10);
		b.print(4, 4, '#');
	}
}

class BB {
	public boolean a(int i) {
		if(i % 2 == 0) {
			System.out.println("为偶数");
			return true;
		} else {
			System.out.println("为基数");
			return false;
		}
	}
	
	public void print(int row,int col,char c) {
		for(int i = 0;i < row; i++) {
			for(int j = 0;j < col;j++) {
				System.out.print(c);
			}
			System.out.println(); //换行
		}
	}
}



