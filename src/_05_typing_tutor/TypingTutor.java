package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	
	static JFrame frame = new JFrame();
	static JLabel label = new JLabel();
	static JPanel panel = new JPanel();
	
	static char currentLetter;
	
	public static void main(String[] args) {
	currentLetter = generateRandomLetter();
	
	TypingTutor type = new TypingTutor();
	type.randomMethod();
	frame.setVisible(true);
	frame.setTitle("TYPE THE LETTER NOW");

	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	
	
	label.setText(currentLetter+"");
	panel.add(label);
	frame.add(panel);
	frame.setSize(300,300);
	frame.pack();
	

	}
	 void randomMethod() {
		frame.addKeyListener(this);
	
	}
	
	static char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	    
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char letterTyped = e.getKeyChar();
		String letter = currentLetter+"";
		if(letter.equalsIgnoreCase(letterTyped+"")) {
			panel.setBackground(Color.GREEN);
			
			frame.pack();
			
		}else {
			panel.setBackground(Color.RED);
			frame.pack();
			
			
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		currentLetter = generateRandomLetter();
		label.setText("");
		label.setText ("        "+currentLetter+"        ");

	
		frame.pack();
	}

	}

