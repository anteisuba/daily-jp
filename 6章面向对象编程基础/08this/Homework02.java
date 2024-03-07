package 面向对象编程基础.this函数;

public class Homework02 {
	public static void main(String[] args) {
		String[] strs = {"ys","sa","aa"};
		
		A02 a02 = new A02();
		int index = a02.find("sa", strs);
		if(index != -1) {
			System.out.println("查找的index为" + index);
		} else {
			System.out.println("输入无效");
		}
	}
}

class A02 {
	
	public int find(String findStr,String[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			if(findStr.equals(arr2[i])) {
				return i;
			}		
		}
		return -1;		
	}
}
