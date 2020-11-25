package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 참조값을 부모type 지역변수에 대입
		Object p1=new HandPhone();
		//대입연산자의 우측을 Phone type으로 casting(형변환) 해서 
		//p1안에 있는 참조값을 Phone type 변수 p2에 대입하기
		Phone p2=(Phone)p1;
		p2.call();
		
		//p1에 있는 값을 HandPhone type으로 casting해서
		//HandPhone type 변수 p3에 대입
		HandPhone p3=(HandPhone)p1;
		p3.mobileCall();
		p3.takePicture();
		
	}
}
