package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton buttonOne = new JButton();
	JButton buttonTwo = new JButton();
	JPanel panel = new JPanel();
	public static void main(String []args) {
		NastySurprise nS = new NastySurprise();
		nS.listenButton();
	}
		void listenButton() {
			
			buttonOne.addActionListener(this);
			buttonOne.setText("Trick");
			buttonTwo.addActionListener(this);
			buttonTwo.setText("Treat");
			panel.add(label);
			panel.add(buttonOne);
			panel.add(buttonTwo);
			frame.add(panel);
			frame.setVisible(true);
			frame.pack();
			
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==buttonOne) {
				showPictureFromTheInternet("https://cdn.akc.org/content/article-body-image/siberian_husky_cute_puppies.jpg");
			}
			if(e.getSource()==buttonTwo) {
				showPictureFromTheInternet("https://i.pinimg.com/originals/61/36/01/6136018df38bda5e3185a727ca6a873e.jpg");
			}
			
			
		}
		private void showPictureFromTheInternet(String imageUrl) {
		    try {
		        URL url = new URL(imageUrl);
		        Icon icon = new ImageIcon(url);
		        JLabel imageLabel = new JLabel(icon);
		        JFrame frame = new JFrame();
		        frame.add(imageLabel);
		        frame.setVisible(true);
		        frame.pack();
		    } catch (MalformedURLException e) {
		        e.printStackTrace();
		    }
		}
		
}
