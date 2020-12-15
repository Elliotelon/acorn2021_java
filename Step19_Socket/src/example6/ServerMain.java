package example6;

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

import org.json.JSONArray;
import org.json.JSONObject;

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
		//스레드가 응대하는 클라이언트의 대화명을 저장할 필드
		private String chatName;
		
		
		//생성자
		public ServerThread(Socket socket) {
			//생성자의 인자로 전달받은 Socket 객체의 참조값을 필드에 저장하기
			this.socket=socket;
			
		}
		//인자로 전달되는 문자열을 Socket 객체를 통해서 출력하는 메소드
		public void sendMessage(String msg) throws IOException {
			//반복문 돌면서 모든 스레드 객체의 참조값을 하나씩 불러내서
			for(ServerThread tmp:threadList) {
				//스레드 객체의 필드 bw(BufferedWriter) 를 이용해서 문자열을 출력한다.
				tmp.bw.write(msg);
				tmp.bw.newLine();
				tmp.bw.flush();
				
			}
		}
		//참여자 목록을 구성해서 모든 클라이언트에게 출력해주는 메소드
		public void sendChatNameList() {
			JSONObject jsonObj=new JSONObject();
			JSONArray jsonArr=new JSONArray();
			//스레드 목록에서 대화명을 순서대로 참조해서 JSONArray에 누적시키기
			for(ServerThread tmp:threadList) {
				jsonArr.put(tmp.chatName);
			}
			//JSONObject에 필요한 정보를 담는다.
			jsonObj.put("type", "members");
			jsonObj.put("list", jsonArr);
			
			//JSONObject의 내용을 JSON 문자열로 바꿔서 전송한다.
			try {
				sendMessage(jsonObj.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				//클라이언트가 전송하는 문자열을 읽어들일 객체
				BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//클라이언트에게 문자열을 출력할 객체
				bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				//반복문 돌면서 클라이언트가 전송하는 문자열이 있는지 읽어와 본다.
				while(true) {
					//문자열 한줄이 전송될때까지 블록킹되는 메소드
					String line=br.readLine();//클라이언트가 전송한 문자열을 읽어와서
					//누군가(현재스레드가 응대하는 클라이언트) 입장했다면
					JSONObject jsonObj=new JSONObject(line);
					String type=jsonObj.getString("type");
					if(type.equals("enter")) {
						//대화명을 필드에 저장한다.
						chatName=jsonObj.getString("name");
						//모든 클라이언트에게 대화명 목록을 보내준다.
						sendChatNameList();
					}
					//클라이언트의 접속이 끊기면
					if(line==null) {
						break;//반복문 while을 탈출하도록 한다.
					}
					
					//서버가 특정 클라이언트에게 받은 문자열을 모든 클라이언트에게 보낸다.
					sendMessage(line);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					//현재 스레드를 목록에서 제거하기
					threadList.remove(this);
					//누가 퇴장하는지 정보를 보낸다.
					JSONObject jsonObj=new JSONObject();
					jsonObj.put("type", "out");
					jsonObj.put("name", this.chatName);
					sendMessage(jsonObj.toString());
					//참여자 목록 업데이트
					sendChatNameList();
					//socket을 닫아준다.
					socket.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}//run()
	}//class ServerThread
}//class ServerMain
	