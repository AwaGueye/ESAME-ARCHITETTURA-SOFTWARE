package ESAME;

public class IntegrazioneDocAllegati {
	public static String integrazione () {
		CreazioneDoc.documento = CreazioneDoc.documento + " " + PreparazioneAllegati.allegato;
		System.out.println("Il documento e gli allegati sono stati integrati.");
		return CreazioneDoc.documento;
	}

}
