package test.mypac;

//extends는 어떤 클래스를 상속 받을때 사용하는 예약어이다.
//어떤 클래스도 extends 하지 않으면 자동으로 Object클래스를 상속 받게 된다.
//따라서 Object 클래스를 상속받을 거라면 생략이 가능하다.

public class Phone extends Object {
	//디폴트 생성자
	public Phone() {
		System.out.println("Phone() 생성자 호출됨");
	}
	//전화거는 non static 메소드
	public void call() {
		System.out.println("전화를 걸어요!");
	}
}
