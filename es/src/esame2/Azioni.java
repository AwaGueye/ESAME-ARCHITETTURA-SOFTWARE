package esame2;

import java.util.Scanner;

public class Azioni {

	public void modifica() {
		Scanner in = new Scanner(System.in);
		String st = "";
		System.out.println("Aggiungi modifica.");
		st = in.nextLine();

		CreazioneDoc.documento = CreazioneDoc.documento + " " + st;
		System.out.println("Il documento è stato modificato, e vale " + CreazioneDoc.documento);
		in.close();
	}

	public void integra() {
		CreazioneDoc.documento = CreazioneDoc.documento + " " + PreparazioneAllegati.allegato;
		System.out.println("Il documento e gli allegati sono stati integrati.");
	}

}
