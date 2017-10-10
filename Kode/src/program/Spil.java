package program;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gui.Game;
import gui.MainScreen;
import gui.Welcome;

public class Spil {

	public final static int TERNING_MIN = 1;
	public final static int TERNING_MAX = 6;
	public final static int SUM_MIN = 2;
	public final static int SUM_MAX = 12;
	public final static int POINTSVUNDET = 40;

	public static void main(String[] args) {

		Welcome scr = new Welcome();
		
		MainScreen ms = new MainScreen();
		ms.show();

		//scr.setVisible(true);		
	}
	
	public static void VisDialog(JFrame frame, String tekst)
	{
		JOptionPane.showMessageDialog(frame, tekst);		
	}
}
