package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleCliker implements ActionListener {
	JButton butt1 = new JButton();
	JButton butt2 = new JButton();
	public static void main(String[] args) {
		
	ChuckleCliker chuckleCliker = new ChuckleCliker();
	chuckleCliker.makeButtons();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public void makeButtons(){
		JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel pan = new JPanel();
		butt1.addActionListener(this);
		butt2.addActionListener(this);
		butt1.setText("joke");
		butt2.setText("punchline");
		

		pan.add(butt1);
		pan.add(butt2);
		frame.add(pan);
				
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "hi");

		if(e.getSource()==butt1) {
			JOptionPane.showMessageDialog(null, "What do you call a fish without the eyes.......... Fsh");
			
		}else {
			JOptionPane.showMessageDialog(null, "Idk what a punchline is, here ----");
		}
	}
}
