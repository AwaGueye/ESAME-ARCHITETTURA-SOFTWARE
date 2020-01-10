package esame2;

/* PATTERN UTILIZZATO: COMMAND PATTERN
 * PROBLEMA
 * il pattern potrebbe anche funzionare ma non riusciamo a risolvere l'eccezione
 */
public class Main {
	public static void main(String[] args) {
		
		Controllo controllo = new Controllo();
		Azioni azione = new Azioni();
		
		PreparazioneAllegati.preparazione();
		CreazioneDoc.creazione();
		Verifica.verifica();
		
		if (Verifica.var.equals("integrazione")) {
			controllo.setCommand(new EseguiIntegrazione(azione));
			Emissione.emissione();
		}
		
		if (Verifica.var.equals("modifica")) {
			controllo.setCommand(new EseguiModifica(azione));
			//Verifica.verifica();
		}
		
		controllo.scelta();
	}

}
