package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		
		for(int i = 0; i<24; i++) {	
			
			 JButton button1 = new JButton();
			 button1.setPreferredSize(new Dimension(50, 25));
			 panel.setPreferredSize(new Dimension(200,250));
			 frame.setTitle("Whack a MOLE!");
					 panel.add(button1);
			 frame.add(panel);
			 frame.setVisible(true);
			 frame.pack();
	}
		WhackAMole mole = new WhackAMole();
		
		mole.speak("Bro Mike sucks at code");
}
	
	
	
	public void addListener() {
		
		for(int i = 0; i<24; i++) {	
			
			 JButton button1 = new JButton();
			 button1.setPreferredSize(new Dimension(50, 25));
			 panel.setPreferredSize(new Dimension(200,250));
			 frame.setTitle("Whack a MOLE!");
			 button1.addActionListener(this);
			 panel.add(button1);
			 frame.add(panel);
			 frame.setVisible(true);
			 frame.pack();
			 
	}
		WhackAMole mole = new WhackAMole();
		
	
		
		
		
		
		
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
		
	}

}
