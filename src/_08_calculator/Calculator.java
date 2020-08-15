package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
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
		 field1.setSize(100,100);
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
}
