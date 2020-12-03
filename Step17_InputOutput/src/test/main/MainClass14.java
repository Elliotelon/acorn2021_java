package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	/*
	 * c:/myFolder/memo.txt 파일에 저장된 문자열을 읽어와서
	 * 콘솔창에 출력하는 코드를 작성해 보세요.
	 * 
	 * hint! -> new FileReader()
	 * hint! -> new BufferedReader()
	 */
	public static void main(String[] args) {
		File f=new File("c:/myFolder/memo.txt");
		try {
			FileReader fr=new FileReader(f);
			//아래 세줄의 코드를 무한 루프 돌면서 수행하다가
			//read() 메소드가 -1을 리턴하면 루프를 탈출하기
			while(true) {
				//read() 메소드는 더이상 읽을 데이터가 없으면 -1을 리턴한다.
				int code=fr.read();
				//만일 code가 -1과 같으면 반복분 while을 탈출 하세요.
				if(code==-1) {
					//break 예약어는 반복문을 탈출하는 예약어이다.
					break;
				}
				//code에 해당하는 문자 값을 얻어내서
				char ch=(char)code;
				//개행기호 없이 출력하기
				System.out.print(ch);	
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
