package test.main;

import test.mypac.House;
import test.mypac.MyObject;
import test.mypac.Phone;

public class MainClass05 {
	public static void main(String[] args) {
		//MyObject 클래스의 callPhone() 메소드를 호출해 보세요.
		MyObject.callPhone(new Phone());
		
		//MyObject 클래스의 buyHouse() 메소드를 호출하고 myHome 변수에 담아 보세요.
		House myHome=MyObject.buyHouse();
		
	}
}
