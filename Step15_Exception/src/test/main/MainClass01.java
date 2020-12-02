package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력:");
		//숫자를 문자열 형식으로 입력 받는다. "10", "20", "10.1", "10.2"...
		String InputNum=scan.nextLine();
		//1. try 블럭을 실행하다가
		try {
		//입력한 숫자를 실제 숫자로 바꾸기
		double num=Double.parseDouble(InputNum);
		double result=num+100;
		System.out.println("입력한 숫자 +100 : "+result);
		}catch(NumberFormatException nfe) {
			//2. NumberFormatException type의 예외가 발생하면 여기가 실행된다.
			System.out.println("숫자 형식에 맞게 입력 하세요!");
			//예외 객체의 메소드를 이용해서 stack에 일어난 일을 콘솔에 출력하기
			nfe.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
		
		
	}
}
