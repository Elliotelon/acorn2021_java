package example5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerMain {
	//접속한 클라이언트를 응대하는 스레드 객체의 목록을 담을 필드
	static List<ServerThread> threadList;
	
	public static void main(String[] args) {
		//ArrayList 객체 생성해서 필드에 저장하기
		threadList=new ArrayList<>();
		
		ServerSocket serverSocket=null;
		try {
			//5000번 통신 port를 열고 클라이언트의 접속을 기다린다.
			serverSocket=new ServerSocket(5000);
			/*
			 * .accept() 메소드는 클라이언트가 접속을 해야지 리턴하는 메소드이다.
			 * 클라이언트가 접속을 해오면 해당 클라이언트와 연결된Socket 객체의
			 * 참조값을 리턴한다. 
			 */
			while(true) {
				System.out.println("클라이언트의 Socket 접속을 기다립니다...");
				//1.클라이언트가 접속을 해오면
				Socket socket=serverSocket.accept();
				//2.새로운 스레드를 시작시킨다.
				ServerThread t=new ServerThread(socket);
				t.start();
				//3.시작된 스레드의 참조값을 목록에 누적시킨다.
				threadList.add(t);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("ServerMain main 메소드가 종료됩니다.");
	}
	//스레드 클래스 설계
	static class ServerThread extends Thread{
		//필드 (클라이언트와 연결된 Socket 객체의 참조값을 저장할 필드)
		private Socket socket;
		//클라이언트에게 문자열을 출력할 객체의 참조값을 저장할 필드
		private BufferedWriter bw;
		//생성자
		public ServerThread(Socket socket) {
			//생성자의 인자로 전달받은 Socket 객체의 참조값을 필드에 저장하기
			this.socket=socket;
			
		}
		//인자로 전달되는 문자열을 Socket 객체를 통해서 출력하는 메소드
		public void broadcast(String msg) throws IOException {
			//인자로 전달된 문자열을 필드에 저장된 BufferedWriter 객체의 참조값을 이용해서
			//클라이언트에게 출력하기
			bw.write(msg);
			bw.newLine();//개행기호
			bw.flush();//방출
		}
		
		
		@Override
		public void run() {
			try {
				//클라이언트가 전송하는 문자열을 읽어들일 객체.
				BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//클라이언트에게 문자열을 출력할 객체.
				bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				//반복문 돌면서 클라이언트가 전송하는 문자열이 있는지 읽어와 본다.
				while(true) {
					//문자열 한줄이 전송될때까지 블록킹되는 메소드
					String line=br.readLine();//클라이언트가 전송한 문자열을 읽어와서
					//반복문 돌면서 모든 클라리언트에게 전송하기
					for(ServerThread tmp:threadList) {
						tmp.broadcast(line);
						
					}
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					socket.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			//현재 여기에 실행순서가 넘어온 스레드의 참조값은 ? this로 참조가능
			//오류가 나거나 접속 종료된 스레드는 목록에서 제거 해야한다.
			threadList.remove(this);
		}//run()
	}//class ServerThread
}
	