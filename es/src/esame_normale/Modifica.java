package esame_normale;

import java.util.Scanner;

public class Modifica {
	
	public static void modifica() {
		Scanner in = new Scanner(System.in);
		System.out.println("Aggiungi modifica.");
		String st = in.nextLine();

		CreazioneDoc.documento = CreazioneDoc.documento + " " + st;
		System.out.println("Il documento è stato modificato, e vale " + CreazioneDoc.documento);
		
		Verifica.verifica();
		in.close();
	}

}
