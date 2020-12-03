package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됩니다.");
		//InputStream, OutputStream 은 1바이트 씩 처리함 
		//키보드로부터 입력 받을 수 있는 객체의 참조값을 kbd라는 이름의 지역변수에 담기
		InputStream kbd=System.in; //한글불가
		try {
			System.out.print("문자열1개 입력 : ");
			int code=kbd.read();
			//입력받은 코드 값 출력하기
			System.out.println("code : "+code);
			//코드에 대응되는 문자1개 얻어내는 방법
			char ch=(char)code;
			System.out.println("ch: "+ch);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
