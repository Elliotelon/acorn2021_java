package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		//콘솔창에 출력할 수 있는 객체의 참조값을 ps라는 지역 변수에 담기
		PrintStream ps=System.out;
		//학습을 위해서 PrintStream 객체를 부모type OutputStream 변수에 담기
		OutputStream os=ps;
		//2byte 처리
		OutputStreamWriter osw=new OutputStreamWriter(os);
		//기능을 좀더 up 시키면
		BufferedWriter br=new BufferedWriter(osw);
		try {
			br.write("안녕하세요");
			br.newLine(); //개행기호를 출력해주는 기능
			br.write("어쩌구~");
			br.newLine(); //개행기호를 출력해주는 기능
			br.write("저쩌구~");
			br.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
