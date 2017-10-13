package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import program.KastResult;
import program.Spil;
import program.Spiller;

public class Game extends MyFrame implements ActionListener {

	MyFrame _parent = null;

	Boolean playerOnesTurn = true;

	JButton btn = null;
	JLabel lblSp1 = null;
	JLabel lblSp2 = null;

	JLabel lblStatusTerning1 = null;
	JLabel lblStatusTerning2 = null;

	Spiller s1 = null;
	Spiller s2 = null;

	public Game(MyFrame parent, Spiller s1, Spiller s2) {

		this.s1 = s1;
		this.s2 = s2;
		_parent = parent;

		lblSp1 = new JLabel();
		lblSp2 = new JLabel();

		lblStatusTerning1 = new JLabel("");
		lblStatusTerning2 = new JLabel("");

		this.setTitle("Så skal der spilles!");
		Container cp = this.getContentPane();
		cp.setLayout(new GridLayout(4, 1));
		btn = new JButton();
		btn.addActionListener(this);

		JPanel pnlSp1 = new JPanel();
		pnlSp1.add(lblSp1);

		JPanel pnlSp2 = new JPanel();
		pnlSp2.add(lblSp2);

		JPanel pnl3 = new JPanel(new GridLayout(2, 1));
		pnl3.add(lblStatusTerning1);
		pnl3.add(lblStatusTerning2);

		JPanel pnl4 = new JPanel();
		pnl3.add(btn);

		cp.add(pnlSp1);
		cp.add(pnlSp2);
		cp.add(pnl3);
		cp.add(pnl4);

		setButtonText(true);
		opdaterPoints();

		this.pack();
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// kast terninger
		if (playerOnesTurn)
			metode(s1);
		else
			metode(s2);
	}

	private void metode(Spiller spiller) {

		Boolean ekstraTur = false;
		KastResult result = spiller.kastTerninger();

		// Sæt værdi af terning
		lblStatusTerning1.setText("Terning 1: " + spiller.getBæger().getTerning1().getØjne());
		lblStatusTerning2.setText("Terning 2: " + spiller.getBæger().getTerning2().getØjne());

		switch (result) {

		case PointsTabt:
			Spil.VisDialog(this, spiller.getNavn() + " slog to ettere og taber alle sine points!");
			break;

		case EkstraTur:
			ekstraTur = true;
			Spil.VisDialog(this, spiller.getNavn() + " slog to ens og må kaste igen!");
			break;

		case SpilVundet:
			Spil.VisDialog(this, spiller.getNavn() + " har vundet!");
			_parent.setVisible(true);
			this.dispose();
			break;

		case FortsætSpil:
			System.out.println("Fortsæt spil");
			break;
		}

		// Opdater points
		opdaterPoints();

		if (!ekstraTur) {
			// Skift tekst på knap
			setButtonText(false);

			// Opdater spillertur
			setPlayerTurn();
		}
	}

	private void setPlayerTurn() {
		if (playerOnesTurn)
			playerOnesTurn = false;
		else
			playerOnesTurn = true;
	}

	private void setButtonText(Boolean firstTurn) {

		String t1 = "Det er " + s1.getNavn() + "s tur til at kaste!";
		String t2 = "Det er " + s2.getNavn() + "s tur til at kaste!";

		if (firstTurn) {
			btn.setText(t1);
			return;
		}

		if (playerOnesTurn)
			btn.setText(t2);
		else
			btn.setText(t1);
	}

	private void opdaterPoints() {
		lblSp1.setText(s1.getNavn() + " har " + s1.getPoint() + " point.");
		lblSp2.setText(s2.getNavn() + " har " + s2.getPoint() + " point.");
	}
}
