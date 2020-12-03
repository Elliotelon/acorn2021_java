package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됩니다.");
		//InputStreamRead 2바이트 처리 (한글입력가능)
		//키보드로부터 입력 받을 수 있는 객체의 참조값을 kbd라는 이름의 지역변수에 담기
		InputStream kbd=System.in;
		InputStreamReader isr=new InputStreamReader(kbd);
		BufferedReader br=new BufferedReader(isr);//한글가능, 한줄 가능
		
		try {
			System.out.println("문자열입력(아무거나 입력가능):");
			String line=br.readLine();
			System.out.println("line : "+line);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("메소드가 종료됩니다.");
		
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
