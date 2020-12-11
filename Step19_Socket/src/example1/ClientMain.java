package example1;

import java.net.Socket;

public class ClientMain {
	public static void main(String[] args) {
		Socket socket=null;
		try {
			//new Socket("접속할 ip주소", 포트번호)
			//127.0.0.1 = 나의아이피주소를 부를때 사용 this랑 비슷한느낌
			socket=new Socket("127.0.0.1", 5000); 
			System.out.println("서버에 Socket 접속 성공!");
			socket.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
