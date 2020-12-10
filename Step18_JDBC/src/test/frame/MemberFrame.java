package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener {
	//필드
	JTextField text_name, text_addr;
	DefaultTableModel model;

	//생성자
	public MemberFrame(String title) {
		super(title);
		//프레임의 레이아웃 법칙 지정하기
		setLayout(new BorderLayout());
		//상단 페널
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.YELLOW);
		//페널을 상단에 배치하기
		add(topPanel, BorderLayout.NORTH);
		//페널에 UI 객체를 생성해서 
		JLabel label_name=new JLabel("이름");
		JLabel label_addr=new JLabel("주소");
		//아래 메소드에서 필요한값을 필드에저장하기
		text_name=new JTextField(10);
		text_addr=new JTextField(10);
		JButton btn_add=new JButton("추가");
		//페널에 순서대로 추가하기
		topPanel.add(label_name);
		topPanel.add(text_name);
		topPanel.add(label_addr);
		topPanel.add(text_addr);
		topPanel.add(btn_add);
		//버튼에 Action Command 지정
		btn_add.setActionCommand("add");
		//버튼에 리스너 등록
		btn_add.addActionListener(this);
		
		//회원목록을 출력할 테이블
		JTable table=new JTable();
		//칼럼명을 String[] 에 순서대로 준비하기
		String[] colNames= {"번호","이름","주소"};
		//테이블에 연결할 기본 모델 객체 
		model=new DefaultTableModel(colNames, 0);
		//모델을 테이블에 연결하기
		table.setModel(model); 
		//테이블의 내용이 scroll 될수 있도록 스크롤 페널로 감싼다.
		JScrollPane scPane=new JScrollPane(table);
		//스크롤 페널을 프레임의 중앙에 배치하기
		add(scPane, BorderLayout.CENTER);
		printMember();
//		//모델의 메소드 확인해보기
//		Object[] row1= {1, "김구라", "노량진"};
//		Object[] row2= {2, "해골", "행신동"};
//		model.addRow(row1);
//		model.addRow(row2);
//		
//		//Vector는 약간 무거운 ArrayList 라고 생각하고 쓰면된다.
//		Vector<Object> vec1=new Vector<>();
//		vec1.add(3);
//		vec1.add("원숭이");
//		vec1.add("상도동");
//		model.addRow(vec1);
		
	}
	//회원목록을 테이블에 출력하는 메소드
	public void printMember() {
		MemberDao dao=new MemberDao();
		List<MemberDto> list=dao.selectAll();
		for(MemberDto tmp:list) {
			//Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			Vector<Object> row=new Vector<>();
			row.add(tmp.getNum());
			row.add(tmp.getName());
			row.add(tmp.getAddr());
			model.addRow(row);
			
		}
	}
	//메인 메소드
	public static void main(String[] args) {
		MemberFrame f=new MemberFrame("회원정보 관리");
		f.setBounds(100,100, 800, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 action command를 읽어 온다.
		String command=e.getActionCommand();
		
		if(command.equals("add")) {//추가 버튼을 눌렀을때
			this.addMember();
			
		}
	}
	
	//회원정보를 추가하는 메소드
	public void addMember() {
		//기존에 출력된 내용 초기화
		model.setRowCount(0); //0개의 row로 강제로 초기화 하고
		
		//1.입력한 이름과 주소를 읽어와서
		String name=text_name.getText();
		String addr=text_addr.getText();
		//2.MemberDto 객체에 담고
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		//3.MemberDao 객체를 이용해서 DB에 저장
		MemberDao dao=new MemberDao();
		//작업의 성공여부를 isSuccess에 담기
		boolean isSuccess=dao.insert(dto);
		//실제 저장되었는지 확인해보세요.
		if(isSuccess) {
			JOptionPane.showMessageDialog(this, name+" "+addr+" 추가성공");
			//테이블에 다시 목록 불러오기
			printMember();
		}else {
			JOptionPane.showMessageDialog(this, "추가 실패");
		}
		
		
	}
	

}
