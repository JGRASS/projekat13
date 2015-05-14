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
			BufferedReader in = new BufferedReader(new FileReader(naziv+",txt"));
			LinkedList<String> listaPitanja=new LinkedList<String>();
			while(true){
				String pom=in.readLine();
				if(pom==null) break;
				
				listaPitanja.add(pom);
			}
			listaPitanja.add(pitanje);
			
			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(naziv+".txt")));
			for (int i = 0; i < listaPitanja.size(); i++) {
				out.append(listaPitanja.get(i).toString());
			}
			out.close();
			in.close();
					
						
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
