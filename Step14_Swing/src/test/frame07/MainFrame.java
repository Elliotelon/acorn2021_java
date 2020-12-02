package test.frame07;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel; //ctrl+shift+o 일괄임포트
import javax.swing.JOptionPane;

public class MainFrame extends JFrame implements ActionListener{
	
	//콤보 박스의 문자열 아이템을 String[] 로 미리 준비하기
    String[] usergame= {"가위","바위","보"};
    JComboBox<String>combo;
    private JLabel lab1;
    private JLabel lab2;
    
    //생성자
    public MainFrame(String title) {
    	super(title);
    	//레이아웃 법칙지정
    	setLayout(new BorderLayout());
    	//콤보 박스 객체를 생성하면서 아이템 배열을 생성자의 인자로 전달
    	combo= new JComboBox<String>(usergame);
    	//문자열을 출력할 레이블 객체 2개 생성하고 초기 문자열은 빈문자열로 지정
    	lab1 = new JLabel("");
    	lab2 = new JLabel("");
    	
    	//콤보박스는 프레임의 북쪽에 배치
    	add(combo,BorderLayout.NORTH);
    	//레이블은 서쪽과 동쪽에 배치
    	add(lab1, BorderLayout.WEST);
    	add(lab2, BorderLayout.EAST);
        //콤보 박스에 액션 리스너 등록
        combo.addActionListener(this);
    }
    //콤보 박스를 선택했을때 호출되는 메소드
    @Override
    public void actionPerformed(ActionEvent e) {
       // 랜덤 객체 생성
       Random ran=new Random();
       //컴퓨터의 패로 사용할 값 0, 1, 2중에 하나의 숫자를 랜덤하게 얻어내기
       int ranNum=ran.nextInt(3);
       //"가위", "바위", "보" 문자열
       String com=usergame[ranNum];
       lab2.setText("Computer: "+com);
       //플레이어가 선택한 패 읽어오기
       String user=combo.getSelectedItem().toString();
       lab1.setText("Player: "+user);
       //결과를 저장할 result 지역변수를 미리 만든다.
       String result=null;
       //이긴경우의 수, 비긴경우, 나머지는 진경우
       if(com.equals("가위") && user.equals("바위")) {//플레이어가 이긴경우
    	   result="이겼습니다.";
       }else if(com.equals("바위")&& user.equals("보")) {//플레이어가 이긴경우
    	   result="이겼습니다.";
       }else if(com.equals("보")&& user.equals("가위")) {//플레이어가 이긴경우
    	   result="이겼습니다.";	
       }else if(com.equals(user)) {//비긴경우
    	   result="비겼습니다.";
       }else {//나머지는 진경우
    	   result="졌습니다.";
       }
       JOptionPane.showMessageDialog(this, result);
    }
    public static void main(String[] args) {
       MainFrame f=new MainFrame("가위,바위,보 게임");
       f.setBounds(100, 100, 300, 300);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
    }
 }
