package _10_pig_latin;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin {
	
	
	static JFrame frame = new JFrame();
	static JButton button = new JButton();
	static JPanel panel = new JPanel();
	static JTextField field1 = new JTextField();
	static JTextField field2 = new JTextField();
	
	
	
	
	
	 public static void main(String[] args) {
		 field1.setPreferredSize(new Dimension(300,30));
		 field2.setPreferredSize(new Dimension(300,30));
		 button.setText("Translate");
		 panel.add(field1);
		 panel.add(button);
		 panel.add(field2);
		 frame.setTitle("Translate to Pig Latin");
		 frame.add(panel);
		 frame.setVisible(true);
		 frame.pack();
		 
		 
		 
	 }
}
