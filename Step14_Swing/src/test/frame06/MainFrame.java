package test.frame06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements ActionListener {
	String rcp;
	JTextField myT;
	//생성자
	public MainFrame(String title) {
		super(title);
		
		//레이아웃 지정
		setLayout(new FlowLayout());
		//버튼
		JButton genBtn=new JButton("결과");
		myT=new JTextField(10);
		//버튼을 프레임에 추가
		add(genBtn);
		add(myT);
		//버튼에 리스너 등록
		genBtn.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {	
		//랜덤한 값을 얻어내기 위한 객체 생성
		Random ran=new Random();
		//0~3사이의 랜덤한 정수
		int ranNum=ran.nextInt(3);
		if(ranNum==0) {
			rcp="가위";
		}else if(ranNum==1) {
			rcp="바위";
		}else if(ranNum==2) {
			rcp="보";
		}
		
		JOptionPane.showMessageDialog(this, "com : "+rcp+" vs 나 : "+myT.getText());
	}
	public static void main(String[] args) {
		MainFrame f=new MainFrame("메인 프레임");
		f.setBounds(300, 300, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
