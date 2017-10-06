package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainScreen extends JFrame implements ActionListener{

	public MainScreen() {

		// Init for denne frame
		this.setTitle("Det gode spil!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setSize(500, 500);
		
		
		
		// Tilføj components
		Container c = this.getContentPane();
		
		c.setLayout(new BorderLayout());		
		
		JPanel pnl1 = new JPanel(new FlowLayout());
		JPanel pnl2 = new JPanel(new FlowLayout());
		JPanel pnl3 = new JPanel(new FlowLayout());
		
		pnl1.add(new JLabel("Navn på spiller 1:"));
		pnl1.add(new JTextField(20));		
		
		pnl2.add(new JLabel("Navn på spiller 2:"));
		pnl2.add(new JTextField(20));		

		JButton btn = new JButton("Spil");
		btn.addActionListener(this);
		pnl3.add(btn);
		
		
		c.add(pnl1, BorderLayout.NORTH);
		c.add(pnl2, BorderLayout.CENTER);
		c.add(pnl3, BorderLayout.SOUTH);
		
		this.pack();
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//TODO: Check for navne
		this.setVisible(false);
		
		Game g = new Game();
		g.setVisible(true);
		
		
	}
}
