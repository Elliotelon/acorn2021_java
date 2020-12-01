package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.mypac.MyFrame;

public class MainFrame2 extends JFrame {
	//필드에 ActionListener
	ActionListener sendListener=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(MainFrame2.this, "전송합니다2");
		}
	};
	ActionListener updateListener=(e)->{
		JOptionPane.showMessageDialog(MainFrame2.this, "수정합니다2");
	};
	ActionListener deleteListener=(e)->{
		JOptionPane.showMessageDialog(MainFrame2.this, "삭제합니다2");
	};
	
	
	//생성자
	public MainFrame2(String title) {
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
		sendBtn.addActionListener(this.sendListener);
		updateBtn.addActionListener(updateListener);
		deleteBtn.addActionListener(deleteListener);
		
	}
	
	
	public static void main(String[] args) {
		MainFrame2 f=new MainFrame2("메인 프레임");
		//위치와 크기 지정
		f.setBounds(100, 100, 500, 300);
		//프레임을 닫으면 프로세스가 종료 되도록(앱이 종료 되도록)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면상에 실제 보이게 한다.
		f.setVisible(true);
	
	}
}
