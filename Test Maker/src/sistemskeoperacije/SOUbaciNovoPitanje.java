package sistemskeoperacije;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.swing.JTextField;

public class SOUbaciNovoPitanje {

	
	public static void upisiPitanje(String naziv,String pitanje){
		
		try {
			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(naziv+".txt", true)));

			out.print("\n"+pitanje);

			out.close();
					
						
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
