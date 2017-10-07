package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import program.Spiller;

public class Game extends MyFrame implements ActionListener{

	String t1 = "Kast terninger spiller 1";
	String t2 = "Kast terninger spiller 2";
	
	JButton btn = null;
	JLabel lblSp1 = null;
	JLabel lblSp2 = null;
	
	Spiller s1 = null;
	Spiller s2 = null;
	
	public Game() {

		lblSp1 = new JLabel("Spiller 1 har 0 point.");
		lblSp2=new JLabel("Spiller 2 har 0 point.");
		this.setTitle("Så skal der spilles!");
		Container cp = this.getContentPane();
		cp.setLayout(new GridLayout(3, 1));
		btn = new JButton(t1);
		btn.addActionListener(this);
		
		JPanel pnlSp1 = new JPanel();
		pnlSp1.add(lblSp1);

		JPanel pnlSp2 = new JPanel();
		pnlSp2.add(lblSp2);

		JPanel pnl3 = new JPanel();
		pnl3.add(btn);

		cp.add(pnlSp1);
		cp.add(pnlSp2);
		cp.add(pnl3);

		this.pack();
		this.setLocationRelativeTo(null);
		
		
		s1 = new Spiller("Hanne");
		s2 = new Spiller("Gurli");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(btn.getText()==t1)
			s1.kastTerninger();
		else
			s2.kastTerninger();
		
		setButtonText();
		opdaterPoints();		
	}

	private void setButtonText() {			
		
		
		if(btn.getText()==t1)
			btn.setText(t2);
		else
			btn.setText(t1);		
	}

	private void opdaterPoints() {
		lblSp1.setText("Spiller 1 har "+s1.getPoint()+" point.");
		lblSp2.setText("Spiller 2 har "+s2.getPoint()+" point.");
	}
}
