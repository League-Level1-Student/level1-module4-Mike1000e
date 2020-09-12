package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {

	
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton spin = new JButton();
	static int label1;
	static int label2;
	static int label3;
	public static void main(String [] args){
		
	SlotMachine slot = new SlotMachine();	
	
	
	slot.addComp();
	
		

	
	
	
	}
	public void addComp(){
		spin.addActionListener(this);
		panel.removeAll();
		
		spin.setText("Spin");

		panel.add(spin);
	
		
		frame.setVisible(true);	
		
		
		for(int b =0; b <3; b++) {
			 JLabel label = new JLabel();
			 Random ran = new Random();
			 int ran2 = ran.nextInt(3);
			 if(ran2 ==0) {
				 label1++;
	try {
		label = createLabelImage("coding72.png");
		
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			 }else if(ran2==1) {
				 label2++;
				try {
					label = createLabelImage("codingcherry2.png");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	 
			 }else if(ran2==2) {
				 label3++;
				 try {
						label = createLabelImage("codingbar.png");
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 }
			 
	panel.add(label);
	
		}
		
		frame.add(panel);			
		frame.pack();
		check();
	
		
		
	
		
		
	}
	
	
	public void check() {
		
		if(label1==3) {
			JOptionPane.showMessageDialog(null, "YOU WINNNN!!!!!");
			System.exit(0);
		}else if(label2==3) {
			JOptionPane.showMessageDialog(null, "YOU WINNNN!!!!!");
			System.exit(0);
		}else if(label3==3) {
			JOptionPane.showMessageDialog(null, "YOU WINNNN!!!!!");
			System.exit(0);
		}
		
		label1 =0;
		label2 =0;
		label3 =0;
		
		
		
		
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		addComp();
	}
    
}
