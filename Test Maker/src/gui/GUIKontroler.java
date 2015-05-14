package gui;

import java.awt.EventQueue;
import java.util.LinkedList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import logicka_kontrola.TestMaker;

public class GUIKontroler {

	private static TestMaker testMaker;
	private static GlavniProzor glavniProzor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testMaker = new TestMaker();
					glavniProzor = new GlavniProzor();
					glavniProzor.setVisible(true);
					glavniProzor.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(
				glavniProzor.getContentPane(),
				"Da li ZAISTA zelite da izadjete iz apliacije", "Izlazak",
				JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	public static void ucitajPredmete(JComboBox comboBox) {
		testMaker.citajPredmete();
		String[] niz = new String[testMaker.getListaPredmeta().size()];
		for (int i = 0; i < testMaker.getListaPredmeta().size(); i++) {
			niz[i] = testMaker.getListaPredmeta().get(i);
		}

		comboBox.setModel(new DefaultComboBoxModel(niz));
	}

	public static void ucitajSvaPitanja(String naziv, JTextArea textArea) {
		testMaker.ucitajIzFajla(naziv);
		
		for (int i = 0; i < testMaker.getListaPitanja().size(); i++) {
			textArea.append(testMaker.getListaPitanja().get(i) + "\n");
		}
		
	}

	public static void napraviTest(int brojGrupa, int brojPitanja, String naziv, JTextArea textArea) {
		testMaker.ucitajIzFajla(naziv+".txt");
		testMaker.napraviTest(brojPitanja, brojGrupa, textArea);
		
	}

	public static void ubaciPitanje(String naziv, String pitanje) {
		testMaker.ubaciPitanje(naziv, pitanje);
	}

	public static void upisiPredmet(String naziv) {
		testMaker.upisiPredmet(naziv);		
	}
}
