package 面向对象编程基础.成员方法;

public class Method02 {
	public static void main(String[] args) {
		int[][] map = {{1,1,1},{1,0,1},{2,1,1}};
		MyTools myTools = new MyTools();
		myTools.printArr(map);
		
		
		
	}
}

class MyTools {
	public void printArr(int[][] map) {
		//对传入的map进行遍历
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print (map[i][j]+ "\t");
			}
		}
	}
	
	
}