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

public class NapraviTestGUI extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JLabel lblPredmet;
	private JList list;
	private JTextField brojGrupaTxt;
	private JLabel lblPitanja;
	private JLabel lblBrojGrupa;
	private JTextField brojPitanjaTxt;
	private JLabel lblBrojPitanjaPo;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	
	//klase na logickom nivou
	private LinkedList<Pitanja> pitanja;
	private LinkedList<String> listaPredmeta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NapraviTestGUI frame = new NapraviTestGUI();
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
	public NapraviTestGUI() {
		setTitle("Novi test");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getComboBox());
		contentPane.add(getLblPredmet());
		contentPane.add(getList());
		contentPane.add(getBrojGrupaTxt());
		contentPane.add(getLblPitanja());
		contentPane.add(getLblBrojGrupa());
		contentPane.add(getBrojPitanjaTxt());
		contentPane.add(getLblBrojPitanjaPo());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		
		pitanja=new LinkedList<Pitanja>();
		listaPredmeta=new LinkedList<String>();
		
		SOIspisiNazivePredmeta.prikaziPredmete(listaPredmeta);
		comboBox.setSelectedItem(listaPredmeta);
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
	private JList getList() {
		if (list == null) {
			list = new JList();
			list.setBounds(10, 111, 324, 151);
		}
		return list;
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
			btnNewButton_1.addActionListener(new BtnNewButton_1ActionListener());
			btnNewButton_1.setBounds(158, 36, 118, 23);
		}
		return btnNewButton_1;
	}
	
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(final ActionEvent arg0) {
			GotovTestGUI frame=new GotovTestGUI();
			frame.setVisible(true);
			SONapraviTest.napraviTest(Integer.parseInt(brojPitanjaTxt.getText()), Integer.parseInt(brojGrupaTxt.getText()), pitanja, GotovTestGUI.textArea);
		}
	}
	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(final ActionEvent arg0) {
			SOUcitajIzFajla.ucitajIzFajla(comboBox.getSelectedItem().toString(), pitanja);
			
				list.setListData(pitanja.toArray());
			
			
		}

		
	}
}
