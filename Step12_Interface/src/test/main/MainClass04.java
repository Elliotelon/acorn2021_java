package test.main;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			
			@Override
			public void up() {
				System.out.println("볼륨을 올려요");
			}
			
			@Override
			public void down() {
				System.out.println("볼륨을 내려요");
			}
		};
		
		//r1지역변수에 담긴값을 3번 사용해 보기
		useRemocon(r1);
		useRemocon(r1);
		useRemocon(r1);
		
		//Remocon type의 참조값을 한번만(일회성)으로 사용하기
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("볼륨을 올려요2");
			}
			
			@Override
			public void down() {
				System.out.println("볼륨을 내려요2");
			}
		});
	}
	
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
