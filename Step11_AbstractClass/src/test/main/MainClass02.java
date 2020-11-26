package test.main;

import test.mypac.Weapon;
import test.mypac.MyWeapon;
import test.mypac.Tank;

public class MainClass02 {
	
	public static void main(String[] args) {
		/*
		 * 여러분이 직접 Weapon 추상클래스를 상속받은 클래스를
		 * 정의해서 객체 생성을 하고 해당 참조값을 이용해서
		 * 아래의 useWeapon 메소드를 호출해 보세요.
		 * (단, 클래스명은 MyWeapon 말고 다른걸로)
		 */
			Weapon t=new Tank();
			MainClass02.useWeapon(t);
			
			class Sword extends Weapon{

				@Override
				public void attack() {
					System.out.println("총총총");
					
				}
				
			}
			Weapon s1=new Sword();
			MainClass02.useWeapon(s1);
		
	}
	
	// Weapon type의 참조값을 인자로 전달 받는 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
