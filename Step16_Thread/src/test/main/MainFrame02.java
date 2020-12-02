package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.mypac.SubThread;

public class MainFrame02 extends JFrame implements ActionListener {
	//생성자
	public MainFrame02(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("알림 띄우기");
		btn.addActionListener(this);
		add(btn, BorderLayout.NORTH);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "알림 입니다. !!!");
		//3. Thread 클래스를 상속받은 SubThread 클래스로 객체생성
		Thread t=new SubThread();
		//4. start() 메소드를 호출하면 새로운 작업단위가 시작된다.
		t.start();
		
		System.out.println("actionPerformed() 메소드가 리턴 합니다.");
	}
	public static void main(String[] args) {
		MainFrame02 f=new MainFrame02("메인 프레임02");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
