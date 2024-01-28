package 数组排序和查找.Homework;

public class Homework01 {
	public static void main(String[] args) {
		
		int[] arr = {10,12,45,90};
		int insertNum = 23;
		int index = -1;  //插入的位置
		int temp = 0;
		
		//遍历arr数组，如果发现insertNum <= arr[i] 说明i就是要插入的位置，使用index=i 把i保留
		//如果遍历完后没有发现insertNum <= arr[i], 说明 index = arr.length
		
		for (int i = 0; i < arr.length; i++) {
			if(insertNum <= arr[i]) {
				index = i;
				break;
			}		
		}
		
		//判断index的值
		if(index == -1) {  //说明没有找到位置
			index = arr.length;	 
		}
		//扩容
		//先创建一个新的数组，大小arr.length + 1
		int[] arrNew = new int[arr.length + 1];
		//将arr的元素拷贝到arrNew，并且要跳过index位置
		for(int i = 0,j = 0;i < arrNew.length;i++) {
			if( i != index ) {  //说明可以把arr元素拷贝到arrNew
				arrNew[i] = arr[j];
				j++;
			} else {
				arrNew[i] = insertNum;
			}
		}
		
		arr = arrNew;
		
		System.out.println("index=" + index);
		for(int i = 0;i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		
	}
}
