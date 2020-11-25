package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass07 {
	public static void main(String[] args) {
		MainClass07.usePhone(new Phone());
		MainClass07.usePhone(new HandPhone());
		MainClass07.usePhone(new SmartPhone());
	}
	
	public static void usePhone(Phone p) {
		p.call();
		//만일 p안에 있는 값이 HandPhone type이 맞다면...
		if(p instanceof HandPhone) { //instanceof 라는 연산자는 true or false
			HandPhone p2=(HandPhone)p;
			p2.mobileCall();
		}
	}
}
