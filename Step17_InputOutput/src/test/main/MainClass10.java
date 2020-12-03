package test.main;

import java.io.File;

public class MainClass10 {
	public static void main(String[] args) {
		//특정 폴더 100개를 반복문 돌면서 만들기
		for(int i=0; i<100; i++) {
			File tmp=new File("c:/myFolder/gura"+i);
			tmp.mkdir();
		}
		System.out.println("오예~");
	}
}
