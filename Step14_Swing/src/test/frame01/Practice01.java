package test.frame01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Practice01 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("버튼프레임");
		f.setSize(800, 500);
		f.setLocation(100, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
		
		JButton btn=new JButton("버튼1");
		JButton btn2=new JButton("버튼2");
		
		btn.setBounds(50,50,100,80);
		btn2.setBounds(200, 50, 100, 80);
		f.add(btn);
		f.add(btn2);
		ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "버튼1누름");
			}
		};
		
		ActionListener listener2=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "버튼2누름");
			}
		};
		
		btn.addActionListener(listener);
		btn2.addActionListener(listener2);
		
		
	}
}
