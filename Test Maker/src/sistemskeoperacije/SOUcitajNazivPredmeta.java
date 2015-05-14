package sistemskeoperacije;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SOUcitajNazivPredmeta {

	
	public static void upisiPredmet(String naziv){
		
		try {
			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("Predmet.txt", true)));
			
			out.print("\n"+naziv);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
