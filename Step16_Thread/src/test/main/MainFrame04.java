package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.mypac.SubThread;

public class MainFrame04 extends JFrame implements ActionListener {
	//생성자
	public MainFrame04(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("알림 띄우기");
		btn.addActionListener(this);
		add(btn, BorderLayout.NORTH);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "알림 입니다. !!!");
		//익명의 local inner class를 이용해서 Thread 객체를 생성하고
		new Thread() {
			@Override
			public void run() {
				try {
					System.out.println("무언가 10초(오랜시간)이 걸리는 작업을 합니다.");
					Thread.sleep(10000);
					System.out.println("시간이 오래 걸리는 작업이 끝났습니다.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		//스레드를 시작 시킨다.
		
		
		System.out.println("actionPerformed() 메소드가 리턴 합니다."); //메인이 먼저 실행되고 다음에 스레드 작업이 나중에 실행됨
	}
	public static void main(String[] args) {
		MainFrame04 f=new MainFrame04("메인 프레임02");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
