package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass01 {
	//run 했을때 application의 시작점 도입점이 되는 main 메소드
	public static void main(String[] args) {
		Phone p1=new Phone ();
		HandPhone p2=new HandPhone();
		//부모클래스(Phone)에 정의된 메소드 호출가능
		p2.call();
		//자식클래스(HandPhone)에 추가된 메소드는 당연히 호출가능
		p2.mobileCall();
		p2.takePicture();
	}
}
