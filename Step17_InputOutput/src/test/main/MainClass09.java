package test.main;

import java.io.File;

public class MainClass09 {
	public static void main(String[] args) {
		File myFile=new File("c:/myFolder");
		//만일 해당 디렉토리가 존재하지 않으면
		if(!myFile.exists()) {
			//디렉토리 만들기
			myFile.mkdir();
			System.out.println("c:/myFolder 를 생성했습니다.");
		}else {
			System.out.println("c:/myFolder 는 이미존재합니다.");
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
