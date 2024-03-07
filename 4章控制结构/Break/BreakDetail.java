package 控制结构.Break;

public class BreakDetail {
	public static void main(String[] args) {
		abc1:
			for(int i = 0; i < 4 ; i++) {  //外层for
				abc2:
					for(int j = 0; j < 10; j++) {  //内层for
						if(j == 2) {
							break abc2;
						}
						System.out.println("j = " + j );
					}
			}
	}
}
