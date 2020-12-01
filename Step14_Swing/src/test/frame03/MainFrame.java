package test.frame03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements ActionListener, KeyListener {
	//필드
	JTextField inputText;
	JLabel lable1;
	
	//생성자
	public MainFrame(String title) {
		super(title);
		//레이아웃 매니저 설정
		this.setLayout(new BorderLayout());
		
		//텍스트필드와 버튼객체를 만들어서
		 //10은 텍스트필드의 크기를 결정함
		JButton sendBtn=new JButton("전송");
		this.inputText=new JTextField(10);
		
		//페널 객체 생성한 다음 페널(div)랑 비슷하다고 이해해도 괜찮음
		JPanel topPanel=new JPanel();
		
		//페널에 텍스트필드와 버튼을 추가하고
		topPanel.add(inputText);
		topPanel.add(sendBtn);
		topPanel.setBackground(Color.YELLOW);
		
		//페널째로 프레임의 북쪽에 배치하기
		add(topPanel, BorderLayout.NORTH);
		
		sendBtn.addActionListener(this);
		
		
		//레이블을 만들어서
		this.lable1=new JLabel();
		//페널에 추가하기
		topPanel.add(lable1);
		
		//JTextField에 키리스너 등록하기
		inputText.addKeyListener(this);
	}
	
	
	//run 했을때 실행순서가 시작되는 main 메소드
	public static void main(String[] args) {
		MainFrame f=new MainFrame("메인 프레임");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//1. JTextField에 입력한 문자열을 읽어와서
		String msg=inputText.getText();
		
		//2. 레이블에 출력한다.
		lable1.setText(msg);
		
	}

	//키를 눌렀을때 호출되는 메소드
	@Override
	public void keyPressed(KeyEvent arg0) {
		//눌러진 키의 코드값 읽어오기
		int code=arg0.getKeyCode();
		System.out.println(code);
		//만일 엔터키를 눌렀다면
		if(code==KeyEvent.VK_ENTER) {
			//1. JTextField에 입력한 문자열을 읽어와서
			String msg=inputText.getText();
			//2. 레이블에 출력한다.
			lable1.setText(msg);
			//3.입력창 초기화
			inputText.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		System.out.println("released");
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		System.out.println("typed");
	}
}
