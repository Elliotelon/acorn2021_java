package test.frame05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class MainFrame extends JFrame implements ActionListener {
	//필드
	JTextField inputNum1, inputNum2;
	JLabel label_result;
	//생성자
	public MainFrame(String title) {
		super(title);
		
		//레이아웃 지정
		setLayout(new BorderLayout());
		//JTextField 객체를 생성해서 참조값을 필드에 저장
		inputNum1=new JTextField(10);
		inputNum2=new JTextField(10);
		//기능버튼 4개
		JButton plusBtn=new JButton("+");
		JButton minusBtn=new JButton("-");
		JButton multipleBtn=new JButton("*");
		JButton divisionBtn=new JButton("/");
		//레이블 2개
		JLabel lable_eq=new JLabel("=");
		label_result=new JLabel();
		//페널 1개
		JPanel panel=new JPanel();
		//페널에 컴포넌트 배치
		panel.add(inputNum1);
		panel.add(plusBtn);
		panel.add(minusBtn);
		panel.add(multipleBtn);
		panel.add(divisionBtn);
		panel.add(inputNum2);
		panel.add(lable_eq);
		panel.add(label_result);
		//프레임에 페널을 북쪽에 배치
		add(panel, BorderLayout.NORTH);
		//버튼에 리스너 등록
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multipleBtn.addActionListener(this);
		divisionBtn.addActionListener(this);
		//버튼의 액션 command 지정하기
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multipleBtn.setActionCommand("multiple");
		divisionBtn.setActionCommand("division");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//입려한 숫자문자열을 실제 산술연산 가능한 숫자로 바꾸기
		double num1=Double.parseDouble(inputNum1.getText());
		double num2=Double.parseDouble(inputNum2.getText());
		
		//연산의 결과값을 저장할 변수 만들고 0으로 초기화
		double result=0;
		//눌러진 버튼의 액션 command를 읽어와서
		String command=e.getActionCommand();
		//if문으로 분기한다.
		if(command.equals("plus")) {
			result=num1+num2;
		}else if(command.equals("minus")) {
			result=num1-num2;
		}else if(command.equals("multiple")) {
			result=num1*num2;
		}else if(command.equals("division")) {
			result=num1/num2;
		}
		//결과값을 JLabel에 출력하기
		String strNum=Double.toString(result);
		label_result.setText(strNum);
	}
	public static void main(String[] args) {
		MainFrame f=new MainFrame("계산기");
		f.setBounds(100, 100, 800, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
