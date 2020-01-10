package esame_normale;

public class IntegrazioneDocAllegati {
	
	public static void integra() {
		CreazioneDoc.documento = CreazioneDoc.documento + " " + PreparazioneAllegati.allegato;
		System.out.println("Il documento e gli allegati sono stati integrati.");
		
		Emissione.emissione();
	}

}
