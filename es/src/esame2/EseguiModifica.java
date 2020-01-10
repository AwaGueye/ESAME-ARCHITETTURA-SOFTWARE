package esame2;

public class EseguiModifica implements Command {

	Azioni azione;

	public EseguiModifica(Azioni azione) {
		this.azione = azione;
	}

	@Override
	public void execute() {
		azione.modifica();
	}
}
