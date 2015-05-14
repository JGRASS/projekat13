package sistemskeoperacije;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextField;

public class SOUbaciNovoPitanje {

	
	public static void upisiPitanje(String naziv,String pitanje){
		
		try {
			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(naziv+".txt")));
			
			out.write(pitanje);
			out.close();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
