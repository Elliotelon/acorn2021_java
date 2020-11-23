package test.main;

import test.mypac.MyObject;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//MyObject 클래스에 있는 usePhone() 메소드를 호출해 보세요.
		MyObject m1=new MyObject();
		Phone p=new Phone();
		m1.usePhone(p);
		System.out.println("-위와 동일한 작업을 2줄의 코딩으로 한다면");
		MyObject p1=new MyObject();
		p1.usePhone(new Phone());
		System.out.println("-위와 동일한 작업을 1줄의 코딩으로 한다면");
		new MyObject().usePhone(new Phone());
		
		
		
	}
}
