package logicka_kontrola;

import java.util.LinkedList;

import javax.swing.JTextArea;

import sistemskeoperacije.SOIspisiNazivePredmeta;
import sistemskeoperacije.SONapraviTest;
import sistemskeoperacije.SOUcitajIzFajla;
import sistemskeoperacije.SOUcitajNazivPredmeta;

public class TestMaker {

	LinkedList<Pitanja> listaPitanja = new LinkedList<Pitanja>();

	public void ucitajIzFajla(String putanja) {
		SOUcitajIzFajla.ucitajIzFajla(putanja, listaPitanja);
	}

	public void napraviTest(int brojPitanja, int brojGrupa, JTextArea textArea) {
		SONapraviTest.napraviTest(brojPitanja, brojGrupa, listaPitanja,
				textArea);
	}
	
	public void upisiPredmet(String naziv){
		SOUcitajNazivPredmeta.upisiPredmet(naziv);
	}
	
	public void citajPredmete(LinkedList<String> listaPredmeta){
		SOIspisiNazivePredmeta.prikaziPredmete(listaPredmeta);
	}
}
