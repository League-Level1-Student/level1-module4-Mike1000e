package _10_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	
	 PigLatinTranslator pigt = new PigLatinTranslator();
	static JFrame frame = new JFrame();
	static JButton button = new JButton();
	static JPanel panel = new JPanel();
	static JTextField field1 = new JTextField();
	static JLabel label = new JLabel();
	
	
	
	
	
	 public static void main(String[] args) {
		 field1.setPreferredSize(new Dimension(300,30));
		 panel.add(label);
		 button.setText("Translate");
		 panel.add(field1);
		 panel.add(button);
		
		 frame.setTitle("Translate to Pig Latin");
		 frame.add(panel);
		 frame.setVisible(true);
		 frame.pack();
		 PigLatin pig = new PigLatin();
	
		 pig.method();
		 
		 
	 }
	 public void method() {
		 
		 
		 button.addActionListener(this);
		 
		 
		 
		 
		 
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = field1.getText();
		
		
		label.setText(pigt.translate(text+""));
		
		frame.pack();
	}
}
