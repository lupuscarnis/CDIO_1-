package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game extends MyFrame {

	public Game() {

		this.setTitle("Så skal der spilles!");

		Container cp = this.getContentPane();

		cp.setLayout(new GridLayout(3, 1));

		JButton btn = new JButton("Kast terninger spiller 1");

		JPanel pnlSp1 = new JPanel();
		pnlSp1.add(new JLabel("Spiller 1 har 0 point."));

		JPanel pnlSp2 = new JPanel();
		pnlSp2.add(new JLabel("Spiller 2 har 0 point."));

		JPanel pnl3 = new JPanel();
		pnl3.add(btn);

		cp.add(pnlSp1);
		cp.add(pnlSp2);
		cp.add(pnl3);

		this.pack();
		this.setLocationRelativeTo(null);
	}
}
