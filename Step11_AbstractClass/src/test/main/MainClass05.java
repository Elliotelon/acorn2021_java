package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		//익명클래스를 이용해서 1회용 Weapon type의 참조값 얻어내서 메소드 호출하기
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("고양이를 공격해요!");
			}
		});
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
