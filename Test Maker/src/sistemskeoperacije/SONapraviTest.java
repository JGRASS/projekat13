package sistemskeoperacije;

import java.util.LinkedList;
import java.util.Random;

import javax.swing.JTextArea;

import logicka_kontrola.Pitanja;

public class SONapraviTest {

	public static void napraviTest(int brojPitanja,
			int brojGrupa, LinkedList<Pitanja> listaPitanja, JTextArea textArea) {

		for (int j = 0; j < brojGrupa; j++) {
			LinkedList<Pitanja> pomocnaLista = new LinkedList<Pitanja>();
			pomocnaLista.addAll(listaPitanja);

			for (int i = 0; i < brojPitanja; i++) {
				Random rd = new Random();
				int a = rd.nextInt(pomocnaLista.size());

				textArea.append(pomocnaLista.get(a).toString()+"\n");
				pomocnaLista.remove(a);
			}
			
		}

	}
}
