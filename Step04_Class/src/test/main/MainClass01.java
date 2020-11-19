package test.main;

import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		//Car type의 참조값을 담을 수 있는 빈 지역 변수 car1만들기
		Car car1=null; //Car 뒤에 커서놓고 컨트롤 스페이스 하면 같은프로젝트 다른패키지에있는 클래스 임포트 됨.
		
		//Car 클래스로 객체를 생성(new)하고 그 생성된 객체의 참조값을 car1에 대입하기
		car1=new Car(); //사물함안에 객체가 생성되고 사물함키값이 car1에 담김.
		
		//car1 지역변수에 있는 참조값을 이용해서 메소드 호출하기
		car1.drive();
		car1.hotHip();
	}
}
