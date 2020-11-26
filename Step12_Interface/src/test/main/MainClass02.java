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
		
		Remocon r1=new MyRemocon();
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
