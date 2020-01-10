package esame2;

public class CreazioneDoc {
	public static String documento = new String("Documento originale");
	public static String creazione () {
		System.out.println("Il documento è stato creato, e vale "+ documento);
		return documento;	
	}
}
