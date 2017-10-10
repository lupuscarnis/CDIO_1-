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

import program.Bæger;
import program.Spiller;

public class MainScreen extends MyFrame implements ActionListener {

	Spiller s1 = null;
	Spiller s2 = null;

	JTextField tf1 = null;
	JTextField tf2 = null;

	public MainScreen() {

		tf1 = new JTextField(20);
		tf2 = new JTextField(20);

		// Init for denne frame
		this.setTitle("Det gode spil!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// this.setSize(500, 500);

		// Tilføj components
		Container c = this.getContentPane();

		c.setLayout(new BorderLayout());

		JPanel pnl1 = new JPanel(new FlowLayout());
		JPanel pnl2 = new JPanel(new FlowLayout());
		JPanel pnl3 = new JPanel(new FlowLayout());

		pnl1.add(new JLabel("Navn på spiller 1:"));
		pnl1.add(tf1);

		pnl2.add(new JLabel("Navn på spiller 2:"));
		pnl2.add(tf2);

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

		// TODO: Check for validt input!

		Spiller s1 = new Spiller(tf1.getText(), new Bæger());
		Spiller s2 = new Spiller(tf2.getText(),new Bæger());

		this.setVisible(false);

		Game g = new Game(this, s1, s2);
		g.setVisible(true);

		resetForm();
	}

	private void resetForm() {
		tf1.setText("");
		tf2.setText("");

	}
}
