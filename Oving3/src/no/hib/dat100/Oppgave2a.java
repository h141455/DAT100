package no.hib.dat100;

import easyIO.*;

public class Oppgave2a {
	public static void main(String[] args) {

		// Check which file?
		In innfil = new In("fil.txt");

		// Find amount of strings
		int antall = innfil.inInt();
		
		// Create a new array of strings
		String[] tekstfil = new String[antall];

		// Place the strings in the array
		for (int i = 0; i < antall; i++){
			tekstfil[i] = innfil.inLine();
		}

		// Write out all the strings
		System.out.println(antall);
		for (int i = 0; i < antall; i++) {
			System.out.println(tekstfil[i]);
		}
		
	}

}
