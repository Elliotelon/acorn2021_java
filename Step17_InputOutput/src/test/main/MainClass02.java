package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됩니다.");
		//InputStreamRead 2바이트 처리 (한글입력가능)
		//키보드로부터 입력 받을 수 있는 객체의 참조값을 kbd라는 이름의 지역변수에 담기
		InputStream kbd=System.in;
		InputStreamReader isr=new InputStreamReader(kbd);//한글가능 but 한글자만가능
		try {
			System.out.println("1글자 입력(한글가능) :");
			int code=isr.read();
			System.out.println("code : "+code);
			char ch=(char)code;
			System.out.println("ch:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
