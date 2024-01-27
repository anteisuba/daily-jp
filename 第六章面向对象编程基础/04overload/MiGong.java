package 面向对象编程基础.overload;

public class MiGong {
	
	public static void main(String[] args) {
		int[][] map = new int[8][7];
		for(int i = 0;i < 7;i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		
		for(int i = 0;i< 8;i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		//输出当前的地图
		System.out.println("当前地图情况");
		for(int i = 0;i < map.length;i++) {
			for(int j = 0;j < map[i].length;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		MiGo h1 = new MiGo();
		h1.findWay(map, 1, 1);
		
		System.out.println("找路的情况如下" );
		for(int i = 0;i < map.length;i++) {
			for(int j = 0;j < map[i].length;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}

class MiGo {
	public boolean findWay(int[][] map, int i , int j) {
		
		if(map[6][5] == 2 ) {
			return true;
		} else {
			if(map[i][j] == 0) {
				map[i][j] = 2;
				if(findWay(map, i+1,j)) {
					return true;
				} else if (findWay(map,i,j + 1)) {
					return true;
				} else if (findWay(map,i -1,j)) {
					return true;
				} else if(findWay(map,i ,j - 1)){
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
		
		
		
	}
}