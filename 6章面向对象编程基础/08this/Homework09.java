package 面向对象编程基础.this函数;

import java.security.PublicKey;

public class Homework09 {
	public static void main(String[] args) {
		Music music = new Music("yan", 22);
		music.play();
		music.getinfo();
	}
}

class Music {
	String name;
	double times;
	public Music(String name,double times) {
		this.name = name;
		this.times = times;
	}
	
	public void play() {
		
	
			if (times %2 == 0) {
				System.out.println("播放");
			} else {
				System.out.println("停止播放");
			}
			
	
		
	}
	
	public void getinfo() {
		System.out.println(name);
		System.out.println(times);
	}
	
}
