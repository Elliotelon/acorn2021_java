package test.mypac;

public class MyWeapon extends Weapon {
	//1. 추상클래스를 상속받으면
	//2. 미완성의 추상 메소드를 반드시 오버라이드 해야한다.
	@Override
	public void attack() {
		System.out.println("코로나를 공격해요~");
		
	}

}
