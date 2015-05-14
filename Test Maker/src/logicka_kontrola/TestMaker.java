package logicka_kontrola;

import java.util.LinkedList;

import javax.swing.JTextArea;

import sistemskeoperacije.SOIspisiNazivePredmeta;
import sistemskeoperacije.SONapraviTest;
import sistemskeoperacije.SOUbaciNovoPitanje;
import sistemskeoperacije.SOUcitajIzFajla;
import sistemskeoperacije.SOUcitajNazivPredmeta;

public class TestMaker {

	LinkedList<Pitanja> listaPitanja = new LinkedList<Pitanja>();
	LinkedList<String> listaPredmeta = new LinkedList<String>();

	public LinkedList<Pitanja> getListaPitanja() {
		return listaPitanja;
	}

	public LinkedList<String> getListaPredmeta() {
		return listaPredmeta;
	}

	public void ucitajIzFajla(String putanja) {
		SOUcitajIzFajla.ucitajIzFajla(putanja, listaPitanja);
	}

	public void napraviTest(int brojPitanja, int brojGrupa, JTextArea textArea) {
		SONapraviTest.napraviTest(brojPitanja, brojGrupa, listaPitanja,
				textArea);
	}

	public void upisiPredmet(String naziv) {
		SOUcitajNazivPredmeta.upisiPredmet(naziv);
	}

	public void citajPredmete() {
		SOIspisiNazivePredmeta.prikaziPredmete(listaPredmeta);
	}

	public void ubaciPitanje(String naziv, String pitanje) {
		SOUbaciNovoPitanje.upisiPitanje(naziv, pitanje);
	}
}
