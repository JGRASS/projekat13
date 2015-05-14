package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import sistemskeoperacije.SOIspisiNazivePredmeta;
import sistemskeoperacije.SOUbaciNovoPitanje;
import sistemskeoperacije.SOUcitajIzFajla;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

import logicka_kontrola.Pitanja;

public class DodajPitanjeGUI extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JLabel lblPredmet;
	private JTextField textField;
	private JLabel lblNovoPitanje;
	private JButton btnUbaciPitanje;

	/**
	 * Create the frame.
	 */
	public DodajPitanjeGUI() {
		setResizable(false);
		setTitle("Dodaj Pitanje");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getComboBox());
		contentPane.add(getLblPredmet());
		contentPane.add(getTextField());
		contentPane.add(getLblNovoPitanje());
		contentPane.add(getBtnUbaciPitanje());
		
		GUIKontroler.ucitajPredmete(comboBox);
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(10, 34, 114, 20);
		}
		return comboBox;
	}
	private JLabel getLblPredmet() {
		if (lblPredmet == null) {
			lblPredmet = new JLabel("Predmet");
			lblPredmet.setBounds(10, 9, 46, 14);
		}
		return lblPredmet;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(10, 87, 385, 65);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNovoPitanje() {
		if (lblNovoPitanje == null) {
			lblNovoPitanje = new JLabel("Novo pitanje");
			lblNovoPitanje.setBounds(10, 62, 70, 14);
		}
		return lblNovoPitanje;
	}
	private JButton getBtnUbaciPitanje() {
		if (btnUbaciPitanje == null) {
			btnUbaciPitanje = new JButton("Ubaci pitanje");
			btnUbaciPitanje.addActionListener(new BtnUbaciPitanjeActionListener());
			btnUbaciPitanje.setBounds(10, 163, 157, 45);
		}
		return btnUbaciPitanje;
	}
	private class BtnUbaciPitanjeActionListener implements ActionListener {
		public void actionPerformed(final ActionEvent arg0) {
			GUIKontroler.ubaciPitanje(comboBox.getSelectedItem().toString(), textField.getText());
			dispose();
		}
	}
}
