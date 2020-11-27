package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	static class MyRemocon3 implements Remocon{
		@Override
		public void up() {
			System.out.println("리모콘3 작동");	
		}
		@Override
		public void down() {
			System.out.println("리모콘3 멈춤");
		}
	}
	
	public static void main(String[] args) {
		Remocon r4=new Remocon() {
			
			@Override
			public void up() {
				System.out.println("익명r4 작동");
			}
			
			@Override
			public void down() {
				System.out.println("익명r4 멈춤");
			}
		};
		useRemocon(r4);
		
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("익명리모콘 작동");
			}
			@Override
			public void down() {
				System.out.println("익명리모콘 멈춤");
			}
		});
		
		//Remocon 인터페이스를 구현한 MyRemocon 클래스를 이용해서 객체를 생성하고
		//참조값을 Remocon type r1 이라는 지역변수에 담기
		Remocon r1=new MyRemocon();
		//r1에 있는 참조값을 전달하면서 useRemocon() 메소드 호출하기
		useRemocon(r1);
		
		class MyRemocon2 implements Remocon{
			@Override
			public void up() {
				System.out.println("리모콘2 작동");
				
			}
			@Override
			public void down() {
				System.out.println("리모콘2 멈춤");
			}	
		}
		Remocon r2=new MyRemocon2();
		useRemocon(r2);
		
		Remocon r3=new MyRemocon3();
		useRemocon(r3);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
