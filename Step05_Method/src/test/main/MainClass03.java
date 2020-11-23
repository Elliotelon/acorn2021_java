package test.main;

import test.mypac.House;
import test.mypac.MyObject;

public class MainClass03 {
	public static void main(String[] args) {
		//MyObject 객체를 생성해서 참조값을 m1 이라는 이름의 지역변수에 대입
		MyObject m1=new MyObject();
		//m1에 있는 참조값을 이용해서 House 객체의 참조값을 얻어와서 myHome이라는
		//이름의 지역변수에 담아 보세요.
		House myHome=m1.getHouse();
		//myHome안에 있는 참조값을 이용해서 집에서 3번 쉬어 보세요.
		myHome.relax("김민규");
		myHome.relax("김민규");
		myHome.relax("김민규");
		
	}
}
