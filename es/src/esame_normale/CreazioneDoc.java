package esame_normale;

public class CreazioneDoc {
	static String documento = new String("Documento originale");
	public static void creazione () {
		System.out.println("Il documento è stato creato, e vale "+ documento);
		Verifica.verifica();
			
	}
	

}
