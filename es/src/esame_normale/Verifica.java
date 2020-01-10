package esame_normale;

import java.util.Scanner;

public class Verifica {
	public static void verifica() {
		Scanner in = new Scanner(System.in);
		String s = "";
		System.out.println("Approvare documento?");
		s = in.nextLine();
		if (s.equals("si")) {
			System.out.println("Il documento può essere integrato con gli allegati.");
			IntegrazioneDocAllegati.integra();
			
		} else {
			System.out.println("Il documento va modificato.");
			Modifica.modifica();
		}
		in.close();		
	}

}
