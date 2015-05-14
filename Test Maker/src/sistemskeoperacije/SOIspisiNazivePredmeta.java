package sistemskeoperacije;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

import logicka_kontrola.Pitanja;

public class SOIspisiNazivePredmeta {

	public static void prikaziPredmete(LinkedList<String> listaPredmeta){
		
		
			try {
				BufferedReader in = new BufferedReader(new FileReader("Predmet.txt"));
				listaPredmeta.clear();
				
				while(true){
					String pom = in.readLine();
					if(pom==null) break;
					
					listaPredmeta.add(pom);
					
					
					
				}
				
				in.close();
			} catch (Exception e) {
			}
	}
}

