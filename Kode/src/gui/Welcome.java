package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Welcome extends MyFrame implements ActionListener{

	public Welcome() {
		this.setTitle("Velkommen til det gode spil!");
		
		
		JButton btn = new JButton("Start nyt spil");
		
		
		JPanel pnl = new JPanel();
		
		
		
		this.getContentPane().add(pnl);
		
		
		// eventlisteners
		btn.addActionListener(this);
		pnl.add(btn);
		
		
		this.pack();
		this.setLocationRelativeTo(null);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);	
		
		MainScreen main = new MainScreen();
		main.setVisible(true);
	}
}
