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
	private JList list;
	private JLabel lblPredmet;
	private JLabel lblSpisakPitanja;
	private JTextField textField;
	private JLabel lblNovoPitanje;
	private JButton btnUbaciPitanje;
	private JButton btnOdaberiPredmet;

	
	private LinkedList<String> listaPredmeta;
	private LinkedList<Pitanja> listaPitanja;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajPitanjeGUI frame = new DodajPitanjeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DodajPitanjeGUI() {
		setResizable(false);
		setTitle("Dodaj Pitanje");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getComboBox());
		contentPane.add(getList());
		contentPane.add(getLblPredmet());
		contentPane.add(getLblSpisakPitanja());
		contentPane.add(getTextField());
		contentPane.add(getLblNovoPitanje());
		contentPane.add(getBtnUbaciPitanje());
		contentPane.add(getBtnOdaberiPredmet());
		
		listaPitanja=new LinkedList<Pitanja>();
		listaPredmeta=new LinkedList<String>();
		SOIspisiNazivePredmeta.prikaziPredmete(listaPredmeta);
		comboBox.setSelectedItem(listaPredmeta);
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(10, 34, 114, 20);
		}
		return comboBox;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
			list.setBounds(10, 91, 257, 138);
		}
		return list;
	}
	private JLabel getLblPredmet() {
		if (lblPredmet == null) {
			lblPredmet = new JLabel("Predmet");
			lblPredmet.setBounds(10, 9, 46, 14);
		}
		return lblPredmet;
	}
	private JLabel getLblSpisakPitanja() {
		if (lblSpisakPitanja == null) {
			lblSpisakPitanja = new JLabel("Spisak pitanja");
			lblSpisakPitanja.setBounds(10, 65, 78, 14);
		}
		return lblSpisakPitanja;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(277, 89, 157, 45);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNovoPitanje() {
		if (lblNovoPitanje == null) {
			lblNovoPitanje = new JLabel("Novo pitanje");
			lblNovoPitanje.setBounds(277, 65, 70, 14);
		}
		return lblNovoPitanje;
	}
	private JButton getBtnUbaciPitanje() {
		if (btnUbaciPitanje == null) {
			btnUbaciPitanje = new JButton("Ubaci pitanje");
			btnUbaciPitanje.addActionListener(new BtnUbaciPitanjeActionListener());
			btnUbaciPitanje.setBounds(277, 162, 157, 45);
		}
		return btnUbaciPitanje;
	}
	private class BtnUbaciPitanjeActionListener implements ActionListener {
		public void actionPerformed(final ActionEvent arg0) {
			SOUbaciNovoPitanje.upisiPitanje(comboBox.getSelectedItem().toString(), textField.getText());
		}
	}
	private class BtnOdaberiPredmetActionListener implements ActionListener {
		public void actionPerformed(final ActionEvent arg0) {
			SOUcitajIzFajla.ucitajIzFajla(comboBox.getSelectedItem().toString(), listaPitanja);
		}
	}
	private JButton getBtnOdaberiPredmet() {
		if (btnOdaberiPredmet == null) {
			btnOdaberiPredmet = new JButton("Odaberi predmet");
			btnOdaberiPredmet.addActionListener(new BtnOdaberiPredmetActionListener());
			btnOdaberiPredmet.setBounds(148, 33, 119, 23);
		}
		return btnOdaberiPredmet;
	}
}
