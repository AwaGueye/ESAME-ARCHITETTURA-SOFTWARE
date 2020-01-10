package ESAME;

import java.util.Scanner;

public abstract class AbstractTemplate {
	
	final void template() {
		approvazione();
		
		if (WantModifica()) {
			modifica();
		}
		
		if (WantEmissione()) {
			emissione();
		}
	}
	
	abstract void modifica();
	abstract void emissione();
	boolean WantModifica() { return true; }
	boolean WantEmissione() { return true; }
	
	public void approvazione() {
		Scanner in = new Scanner(System.in);
		System.out.println("Approvare documento?");
		String s = in.nextLine();
		if (s.equals("si")) {
			System.out.println("Il documento può essere integrato con gli allegati.");
			//boolean WantModifica() { return false; }
			
		} else {
			System.out.println("Il documento va modificato.");
			//boolean WantEmissione() { return false; }
		}
		in.close();
	}

}
