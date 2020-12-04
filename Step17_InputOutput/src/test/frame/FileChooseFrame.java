package test.frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooseFrame extends JFrame implements ActionListener{
	//생성자
	public FileChooseFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton selectBtn=new JButton("파일 선택하기");
		add(selectBtn, BorderLayout.NORTH);
		selectBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JFileChooser fc=new JFileChooser("c:/myFolder");
		int result=fc.showOpenDialog(this);
		if(result==JFileChooser.APPROVE_OPTION) {//파일을 선택하고 확인을 눌렀을때
			File selectedFile=fc.getSelectedFile();
			selectedFile.delete();
		}else if(result==JFileChooser.CANCEL_OPTION) {//취소 버튼을 눌렀을때
			
		}
		System.out.println("actionPerformed() 메소드가 종료 됩니다.");
		
	}	
	//메인 메소드 
	public static void main(String[] args) {
		FileChooseFrame f=new FileChooseFrame("파일 선택하는 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

