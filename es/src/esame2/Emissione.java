package esame2;

public class Emissione {

	public static void emissione() {
		String s = EseguiIntegrazione.emiss;
		if (s.equals("emissione ok")) {
			System.out.println("Il documento � stato emesso e vale " + CreazioneDoc.documento);
		}
	}
}
