package esame2;

import java.util.Scanner;

public class Verifica {
	public static String var = "";
	public static void verifica() {
		String s = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Approvare documento?");
		s = in.nextLine();
		if (s.equals("si")) {
			System.out.println("Il documento può essere integrato con gli allegati.");
			var = "integrazione";
			
		} else {
			System.out.println("Il documento va modificato.");
			var = "modifica";
		}
		in.close();		
	}

}
