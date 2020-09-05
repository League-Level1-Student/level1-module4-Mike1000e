package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	int moleskilled;
	int epicFail;
	static WhackAMole mole = new WhackAMole();
	int whatButton;
	Random ran;
	static Date time;
	public static void main(String[] args) {
		
		 

	
		mole.addListener();
		time = new Date();
}
	
	
	
	public void addListener() {
		 panel.setPreferredSize(new Dimension(400,250));
		 frame.setTitle("Whack a MOLE!");
		 frame.add(panel);
		 frame.setVisible(true);
		 frame.pack();
		 ran = new Random();
		 whatButton = ran.nextInt(25);
		
		for(int i = 0; i<24; i++) {	
			 if(i==whatButton) {
				 JButton button2 = new JButton();
				 button2.setPreferredSize(new Dimension(100, 25));
				 button2.addActionListener(this);
				 panel.add(button2);
				 button2.setText("mole!");
				 
			 }else{
			 JButton button1 = new JButton();
			 button1.setPreferredSize(new Dimension(100, 25));
			 button1.addActionListener(this);
			 panel.add(button1);
		}
			
			}
		
	
		
}
    static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if(buttonClicked.getText().equals("mole!")) {
			speak("you killed it man");
			panel.removeAll();
			mole.addListener();
			moleskilled++;
			}else {
				
				speak("you missed loser");
				epicFail++;
				panel.removeAll();
				mole.addListener();
				if(epicFail>5) {
				mole.endGame(time, moleskilled);	
					
					
				}
				
				
				
				
			}
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

}
