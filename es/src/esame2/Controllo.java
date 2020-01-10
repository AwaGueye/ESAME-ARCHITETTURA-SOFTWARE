package esame2;

public class Controllo {
	Command slot;
	
	public Controllo() {
	}
	
	public void setCommand (Command command) {
		slot = command;
	}
	
	public void scelta () {
		slot.execute();
	}
	

}
