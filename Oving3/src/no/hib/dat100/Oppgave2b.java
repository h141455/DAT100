package no.hib.dat100;

import easyIO.In;

public class Oppgave2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Check which file?
		In innfil = new In("fil.txt");
		
		// Find amount of strings
		int antall = innfil.inInt();
		
		// Create a new array of strings
		String[] ord = new String[antall];

		// Place the strings in the array
		for (int i = 0; i < antall; i++){
			ord[i] = innfil.inLine();
		}
		
		// Looking for a pattern entered by the user. 
		System.out.println("Skriv et mønster: ");
		In tast = new In();
		String monster = tast.inWord();
		
		// Counter for the same pattern
		int antallLike = 0;
		
		// Look for the pattern in the string array.
		for (int i = 0; i < antall; i++){
			if(ord[i].contains(monster)){
				antallLike++;
			}
		}
		
		System.out.println("Antall ord som inneholder " + monster + ": " + antallLike);

	}

}
