package esame2;

public class EseguiIntegrazione implements Command {
	Azioni azione;
	public static String emiss = "emissione ok";

	public EseguiIntegrazione(Azioni azione) {
		this.azione = azione;
	}

	@Override
	public void execute() {
		azione.integra();
	}

}
