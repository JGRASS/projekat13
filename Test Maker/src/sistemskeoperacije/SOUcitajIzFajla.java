package sistemskeoperacije;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;

import logicka_kontrola.Pitanja;

public class SOUcitajIzFajla {

	public static void ucitajIzFajla(String naziv, LinkedList<Pitanja> listaPitanja){
		try {
			BufferedReader in = new BufferedReader(new FileReader(naziv));
			listaPitanja.clear();
			
			while(true){
				String pom = in.readLine();
				if(pom==null) break;
				
				Pitanja pitanje = new Pitanja();
				pitanje.setPitanje(pom);
				
				listaPitanja.add(pitanje);
			}
			
			in.close();
		} catch (Exception e) {
		}
	}
}
