package test.frame04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	JTextField inputText, inputText2;
	JLabel label1,label2;
	
	
	public Calculator(String title) {
		super(title);
		
		this.setLayout(new BorderLayout());
		
		JButton add=new JButton("+");
		JButton sub=new JButton("-");
		JButton mul=new JButton("*");
		JButton div=new JButton("/");
		this.inputText =new JTextField(10);
		this.inputText2 =new JTextField(10);
		
		JPanel topPanel=new JPanel();
		topPanel.add(inputText);
		topPanel.add(add);
		topPanel.add(sub);
		topPanel.add(mul);
		topPanel.add(div);
		topPanel.add(inputText2);
		topPanel.setBackground(Color.YELLOW);
		add(topPanel, BorderLayout.NORTH);
		this.label1=new JLabel();
		this.label2=new JLabel();
		topPanel.add(label1);
		topPanel.add(label2);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
	}
	public static void main(String[] args) {
		Calculator f2=new Calculator("frame");
		f2.setBounds(100, 100, 500, 300);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setVisible(true);
	}
	@Override
	   public void actionPerformed(ActionEvent e) {
	      double c1 = Double.parseDouble(inputText.getText());
	      double c2 = Double.parseDouble(inputText2.getText());
	      
	      String command = e.getActionCommand();
	      
	      double result = 0;
	      if(command.equals("+")) {
	         result = c1 + c2;
	      } else if (command.equals("-")) {
	         result = c1 - c2;
	      } else if (command.equals("*")) {
	         result = c1 * c2;
	      } else if (command.equals("/")) {
	         result = c1 / c2;
	      }
	      
	      label1.setText("="); 
	      label2.setText(Double.toString(result)); 
	      inputText.setText("");
	      inputText2.setText("");
	   }
	
}
