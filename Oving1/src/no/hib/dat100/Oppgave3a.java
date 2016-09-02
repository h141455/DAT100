package no.hib.dat100;

import static javax.swing.JOptionPane.*;
import javax.swing.JOptionPane;

public class Oppgave3a {
	
	static String message = "Oppgi antall sekunder: ";
	static String title = "Oppgave 3";

	public static void main(String[] args) {
		// To show dialog box.
		String tallTxt=showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
		int brukerSekunder = Integer.parseInt(tallTxt);
		
		// Calculating the time.
		int antallTimer = brukerSekunder / 3600;
		int antallMinutter = (brukerSekunder / 60) % 60;
		int antallSekunder = brukerSekunder % 60;
		
		// Formating the answer and displaying the result in a dialog box.
		String resultat = (antallTimer + " timer, " + antallMinutter + " minutter, " + antallSekunder + " sekunder.");
		showMessageDialog(null, resultat, title, JOptionPane.INFORMATION_MESSAGE);

	}

}
