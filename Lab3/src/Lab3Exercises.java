import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	
	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		
		JFrame myFrame = new JFrame("Brian E. Munoz");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(((width/2) - 250), (height/2) - 250);
		myFrame.setSize(500, 500);
		
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		
		myFrame.setVisible(true);
	}
	
}

	