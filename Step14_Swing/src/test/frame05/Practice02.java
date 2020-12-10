package test.frame05;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Practice02 extends JFrame implements ActionListener{
	
	JTextField l_input, r_input;
	JLabel rs_label;
	public Practice02(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		
		JButton btn_plus=new JButton("+");
		JButton btn_minus=new JButton("-");
		JButton btn_multiple=new JButton("*");
		JButton btn_division=new JButton("/");
		
		l_input=new JTextField(10);
		r_input=new JTextField(10);
		
		JLabel eq_label=new JLabel("=");
		rs_label=new JLabel();
		
		JPanel topPanel=new JPanel();
		
		topPanel.add(l_input);
		topPanel.add(btn_plus);
		topPanel.add(btn_minus);
		topPanel.add(btn_multiple);
		topPanel.add(btn_division);
		topPanel.add(r_input);
		topPanel.add(eq_label);
		topPanel.add(rs_label);
		
		add(topPanel, BorderLayout.NORTH);
		
		btn_plus.addActionListener(this);
		btn_minus.addActionListener(this);
		btn_multiple.addActionListener(this);
		btn_division.addActionListener(this);
		
		btn_plus.setActionCommand("plus");
		btn_minus.setActionCommand("minus");
		btn_multiple.setActionCommand("multiple");
		btn_division.setActionCommand("division");
		
		
		
		
	}
	
	public static void main(String[] args) {
		Practice02 f=new Practice02("Calculator");
		f.setBounds(100, 100, 800, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		
		double l_num=Double.parseDouble(l_input.getText());
		double r_num=Double.parseDouble(r_input.getText());
		
		double result=0;
		
		if(command.equals("plus")) {
			result=l_num+r_num;
		}else if(command.equals("minus")) {
			result=l_num-r_num;
		}else if(command.equals("multiple")) {
			result=l_num*r_num;
		}else if(command.equals("division")) {
			result=l_num/r_num;
		}
		rs_label.setText(Double.toString(result));
		
	}
}
