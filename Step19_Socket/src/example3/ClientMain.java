package example3;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;

public class ClientMain  {
	
	public static void main(String[] args) {
		
		while(true) {
			//1.Socket을 통해서 출력할 전송할 문자열을 콘솔로 입력받아서
			Scanner scan=new Scanner(System.in);
			System.out.println("전송할 문자열 입력 :");
			String msg=scan.nextLine();
			
			Socket socket=null;
			try {
				//new Socket("접속할 ip주소", 포트번호)
				//127.0.0.1 = 나의아이피주소를 부를때 사용 this랑 비슷한느낌
				socket=new Socket("14.63.164.99", 5000); 
				System.out.println("서버에 Socket 접속 성공!");
				//2.Socket을 통해서 출력하기
				OutputStream os=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(os);
				osw.write(msg);//입력한 문자열 출력
				osw.write("\r\n"); //개행기호출력
				osw.flush();//방출
				osw.close();//닫아주기
				
				socket.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
