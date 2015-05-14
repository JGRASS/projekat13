package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import sistemskeoperacije.SOIspisiNazivePredmeta;
import sistemskeoperacije.SONapraviTest;
import sistemskeoperacije.SOUcitajIzFajla;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

import logicka_kontrola.Pitanja;
import logicka_kontrola.TestMaker;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NapraviTestGUI extends JFrame {

	private JPanel contentPane;
	private static JComboBox comboBox;
	private JLabel lblPredmet;
	private JTextField brojGrupaTxt;
	private JLabel lblPitanja;
	private JLabel lblBrojGrupa;
	private JTextField brojPitanjaTxt;
	private JLabel lblBrojPitanjaPo;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextArea textArea;

	// klase na logickom nivou
	private LinkedList<Pitanja> pitanja;

	/**
	 * Create the frame.
	 */
	public NapraviTestGUI() {
		setTitle("Novi test");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 493, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getComboBox());
		contentPane.add(getLblPredmet());
		contentPane.add(getBrojGrupaTxt());
		contentPane.add(getLblPitanja());
		contentPane.add(getLblBrojGrupa());
		contentPane.add(getBrojPitanjaTxt());
		contentPane.add(getLblBrojPitanjaPo());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());

		GUIKontroler.ucitajPredmete(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 326, 153);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		pitanja = new LinkedList<Pitanja>();

	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(10, 37, 118, 20);
		}
		return comboBox;
	}

	private JLabel getLblPredmet() {
		if (lblPredmet == null) {
			lblPredmet = new JLabel("Predmet");
			lblPredmet.setBounds(10, 11, 46, 14);
		}
		return lblPredmet;
	}

	private JTextField getBrojGrupaTxt() {
		if (brojGrupaTxt == null) {
			brojGrupaTxt = new JTextField();
			brojGrupaTxt.setBounds(367, 109, 102, 20);
			brojGrupaTxt.setColumns(10);
		}
		return brojGrupaTxt;
	}

	private JLabel getLblPitanja() {
		if (lblPitanja == null) {
			lblPitanja = new JLabel("Pitanja");
			lblPitanja.setBounds(10, 86, 46, 14);
		}
		return lblPitanja;
	}

	private JLabel getLblBrojGrupa() {
		if (lblBrojGrupa == null) {
			lblBrojGrupa = new JLabel("Broj grupa");
			lblBrojGrupa.setBounds(367, 86, 102, 14);
		}
		return lblBrojGrupa;
	}

	private JTextField getBrojPitanjaTxt() {
		if (brojPitanjaTxt == null) {
			brojPitanjaTxt = new JTextField();
			brojPitanjaTxt.setBounds(367, 163, 102, 20);
			brojPitanjaTxt.setColumns(10);
		}
		return brojPitanjaTxt;
	}

	private JLabel getLblBrojPitanjaPo() {
		if (lblBrojPitanjaPo == null) {
			lblBrojPitanjaPo = new JLabel("Broj pitanja po grupi");
			lblBrojPitanjaPo.setBounds(367, 140, 110, 14);
		}
		return lblBrojPitanjaPo;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Napravi test");
			btnNewButton.addActionListener(new BtnNewButtonActionListener());

			btnNewButton.setBounds(367, 216, 102, 46);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odaberi predmet");
			btnNewButton_1
					.addActionListener(new BtnNewButton_1ActionListener());
			btnNewButton_1.setBounds(158, 36, 118, 23);
		}
		return btnNewButton_1;
	}

	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(final ActionEvent arg0) {
			GotovTestGUI frame = new GotovTestGUI(Integer.parseInt(brojGrupaTxt
					.getText()), Integer.parseInt(brojPitanjaTxt.getText()),
					comboBox.getSelectedItem().toString());
			frame.setVisible(true);
			dispose();
		}
	}

	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(final ActionEvent arg0) {
			GUIKontroler.ucitajSvaPitanja(
					comboBox.getSelectedItem().toString(), textArea);
		}

	}
}
