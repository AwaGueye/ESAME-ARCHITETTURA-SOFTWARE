package ESAME;

/* PATTERN UTILIZZATO: TEMPLATE METHOD
 * PROBLEMA
 * il metodo approvazione() viene chiamato sempre, però modifica() ed emissione()
 * sono dipendenti dalla scelta dell'utente e non possono essere implementati ogni volta.
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Avvia processo");
		PreparazioneAllegati.preparazione();
		CreazioneDoc.creazione();
		
		AbstractTemplate cosa = new Concrete();
		cosa.template();
		
	}

}
