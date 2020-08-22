package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	static int anwserForAdd ;
	static int anwserForSub ;
	static int anwserForMul ;
	static int anwserForDiv ;
	static JFrame frame = new JFrame();
	static JButton add = new JButton();
	static JButton subtract = new JButton();
	static JButton multiply  = new JButton();
	static JButton divide = new JButton();
	static JTextField field1 = new JTextField();
	static JTextField field2 = new JTextField();
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel();
	 public static void main(String[] args) {
		 field1.setPreferredSize(new Dimension(100,30));
		 field2.setPreferredSize(new Dimension(100,30));
		 panel.setPreferredSize(new Dimension(250,150));
		 add.setText("add");
		 subtract.setText("subtract");
		 multiply.setText("multiply");
		 divide.setText("divide");
		Calculator calc = new Calculator();
		calc.actionListener();

		label.getX();
		label.getY();
		 panel.add(field1);
		 panel.add(field2);
		 panel.add(add);
		 panel.add(subtract);
		 panel.add(multiply);
		 panel.add(divide);
		 panel.add(label);
		 frame.add(panel);
		 frame.setVisible(true);
		 frame.pack();
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	 public void actionListener() {
		 add.addActionListener(this);
		 subtract.addActionListener(this);
		 multiply.addActionListener(this);
		 divide.addActionListener(this);
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	 public int add(int field1, int field2) {
		 
		 anwserForAdd = field1+field2;
		return(anwserForAdd); 
		 
		 }
	 public int subtract(int field1, int field2) {
		 
		 anwserForSub = field1-field2;
		return(anwserForSub); 
		 
		 }
 
	 public int multiply(int field1, int field2) {
	 
	 anwserForMul = field1*field2;
	return(anwserForMul); 
	 
	 }

	 public int divide(int field1, int field2) {
	 
	 anwserForDiv = field1/field2;
	return(anwserForDiv); 
	 
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(add)) {
			String fieldOneText = field1.getText();
			int numberOne = Integer.parseInt(fieldOneText);
			String fieldTwoText = field2.getText();
			int numberTwo = Integer.parseInt(fieldTwoText);
			int finalAdd = add(numberOne,numberTwo);
		
		 
			label.setText(finalAdd+"");
			frame.pack();
		}else if(e.getSource().equals(subtract)) {
			
				String fieldOneText = field1.getText();
				int numberOne = Integer.parseInt(fieldOneText);
				String fieldTwoText = field2.getText();
				int numberTwo = Integer.parseInt(fieldTwoText);
				int finalAdd = subtract(numberOne,numberTwo);
			
			 
				label.setText(finalAdd+"");
				frame.pack();	
			
			}else if(e.getSource().equals(multiply)) {
			
				String fieldOneText = field1.getText();
				int numberOne = Integer.parseInt(fieldOneText);
				String fieldTwoText = field2.getText();
				int numberTwo = Integer.parseInt(fieldTwoText);
				int finalAdd = multiply(numberOne,numberTwo);
			
			 
				label.setText(finalAdd+"");
				frame.pack();	
				
			}else if(e.getSource().equals(divide)) {
			
				String fieldOneText = field1.getText();
				int numberOne = Integer.parseInt(fieldOneText);
				String fieldTwoText = field2.getText();
				int numberTwo = Integer.parseInt(fieldTwoText);
				int finalAdd = divide(numberOne,numberTwo);
			
			 
				label.setText(finalAdd+"");
				frame.pack();	
			}
		
	}
}
