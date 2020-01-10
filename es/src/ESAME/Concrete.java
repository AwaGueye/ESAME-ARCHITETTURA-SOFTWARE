package ESAME;
import java.util.Scanner;
public class Concrete extends AbstractTemplate {
	@Override
	void modifica() {	
		Scanner in = new Scanner(System.in);
		System.out.println("Aggiungi modifica.");
		String s = in.nextLine();
		
		CreazioneDoc.documento = CreazioneDoc.documento + " " + s;
		System.out.println("Il documento è stato modificato, e vale "+ CreazioneDoc.documento);
		in.close();
	}

	@Override
	void emissione() {
		System.out.println("Il documento è stato emesso e vale "+CreazioneDoc.documento);				
	}
}
