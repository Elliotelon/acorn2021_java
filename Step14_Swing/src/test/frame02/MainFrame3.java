package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.mypac.MyFrame;

public class MainFrame3 extends JFrame {
	//필드에 ActionListener
	ActionListener listener=new ActionListener() {
		//인자로 전달되는 ActionEvent 객체에는 눌러진 버튼의 정보가 들어있다.
		@Override
		public void actionPerformed(ActionEvent e) {
			//e.
			//이벤트가 일어난 UI (Button)의 ActionCommand 값을 읽어온다.
			String command=e.getActionCommand();
			
			//중요!!!
			//문자열(String)의 *내용* 을 비교 할때는 ==을 사용하지말고 ==는 참조값비교하는거임
			//.equals()메소드를 이용해야 한다.
			if(command.equals("send")) {
				JOptionPane.showMessageDialog(MainFrame3.this, "전송!!");
			}else if(command.equals("update")) {
				JOptionPane.showMessageDialog(MainFrame3.this, "수정!!");
			}else if(command.equals("delete")) {
				JOptionPane.showMessageDialog(MainFrame3.this, "삭제!!");
			}
			
		}
	};
	
	//생성자
	public MainFrame3(String title) {
		super(title); //부모생성자에 전달하기
		//레이아웃 매니저 지정하기
		setLayout(new FlowLayout()); //물 흐르듯이 배치되는 레이아웃
		//버튼
		JButton sendBtn=new JButton("전송");
		JButton updateBtn=new JButton("수정");
		JButton deleteBtn=new JButton("삭제");
		
		
		//버튼을 프레임에 배치하기
		add(sendBtn);
		add(updateBtn);
		add(deleteBtn); //this.add(deleteBtn) 임 this 생략된거임	
		
		//버튼에 리스너 등록하기
		sendBtn.addActionListener(listener);
		updateBtn.addActionListener(listener);
		deleteBtn.addActionListener(listener);
		
		//버튼에 ActionCommand를 원하는대로 지정할 수 있다.
		sendBtn.setActionCommand("send");
		updateBtn.setActionCommand("update");
		deleteBtn.setActionCommand("delete");
	}
	
	
	public static void main(String[] args) {
		MainFrame3 f=new MainFrame3("메인 프레임");
		//위치와 크기 지정
		f.setBounds(100, 100, 500, 300);
		//프레임을 닫으면 프로세스가 종료 되도록(앱이 종료 되도록)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면상에 실제 보이게 한다.
		f.setVisible(true);
	
	}
}
