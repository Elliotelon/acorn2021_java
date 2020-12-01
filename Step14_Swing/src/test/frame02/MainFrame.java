package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.mypac.MyFrame;

public class MainFrame extends JFrame {
	//생성자
	public MainFrame(String title) {
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
		
		sendBtn.addActionListener(send);
		updateBtn.addActionListener(update);
		deleteBtn.addActionListener(delete);
		
		sendBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.this, "전송합니다");
				
			}
		});
		//수정버튼에 리스너 등록하기
		updateBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(MainFrame.this, "수정합니다");
		});
		//삭제버튼에 리스너 등록하기
		deleteBtn.addActionListener((e)->{
		JOptionPane.showMessageDialog(MainFrame.this, "삭제합니다");
		});
	}
	
	ActionListener send=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(MainFrame.this, "전송버튼을 눌렀습니다.");
        }
     };
     ActionListener update=new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(MainFrame.this, "수정버튼을 눌렀습니다.");
        }
     };
     
     
     ActionListener delete=new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(MainFrame.this, "삭제버튼을 눌렀습니다.");
        }
     };

	
	public static void main(String[] args) {
		MainFrame f=new MainFrame("메인 프레임");
		//위치와 크기 지정
		f.setBounds(100, 100, 500, 300);
		//프레임을 닫으면 프로세스가 종료 되도록(앱이 종료 되도록)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면상에 실제 보이게 한다.
		f.setVisible(true);
	
	}
}
