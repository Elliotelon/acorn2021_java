package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass13 {
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
			BufferedReader br=new BufferedReader(fr);
			//readline() 메소드가 null을 리턴하면 반복문 탈출
			while(true) {
				String s=br.readLine();
				if(s==null) {
					break;
				}
				System.out.println(s);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
