package example3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientFrame extends JFrame implements ActionListener{
	JTextField tf;
	//생성자
	public ClientFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		
		
		//페널을 만들어서 프레임의 위쪽에 배치하기
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.YELLOW);
		add(topPanel, BorderLayout.NORTH);
		
		//프레임에 UI 배치 하기
		tf=new JTextField(50);
		JButton sendBtn=new JButton("send");
		topPanel.add(tf);
		topPanel.add(sendBtn);
		
		//버튼 리스너 등록하기
		sendBtn.addActionListener(this);
		
	
		
	}
	public static void main(String[] args) {
		//프레임객체 생성하면서 프레임의 제목을 chatting 으로 지정하기
		ClientFrame f=new ClientFrame("chatting");
		//프레임의 x좌표, y좌표, width, height 설정하기
		f.setBounds(100, 100, 800, 200);
		//프레임 닫을때 프로세스도 종료 되도록한다.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임을 화면상에 보이게 하기
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//1. JTextField 에 입력한 문자열을 읽어와서
		String msg=tf.getText();
		//2. Socket 접속을 해서 전송한다.
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
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		//3. JTextField에 입력한 문자열 삭제
		tf.setText("");
	}
}
