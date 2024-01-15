package 数组排序和查找.Homework;

public class Homework02 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1; //生成1到100的随机数	
		}
		
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
		
		double sum = 0;
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
			
			if( max < arr[i]) {
				max = arr[i];
				maxIndex = 1;
			}
		}
		
		System.out.println("max=" +max + maxIndex + "sum="+sum +"平均值="+ sum / arr.length);
		//查找数组中是否有8
		int findNum = 8;
		int index = -1;
		
		for(int i = 0;i < arr.length;i++) {
			if(findNum == arr[i]) {
				System.out.println("找到数" + findNum + "xiabiao" + i);
				index = i;
				break;
			} 
		}
		
		if(index == -1) {
			System.out.println("没有找到这个数");
		}
		
		
		
	}
}
