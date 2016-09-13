package no.hib.dat100;

import easyIO.In;

public class Oppgave2c {
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

		// Check length of each word
		for (int i = 0; i < antall; i++){
			int ordLengde = ord[i].length();
			
			// Odd length words, keep three middle letters 
			if ((ordLengde % 2 != 0) && ordLengde >=3){
				int beginIndex = (ordLengde / 2) -1;
				int endIndex = (ordLengde / 2) + 2;
				
				String tre = ord[i].substring(beginIndex, endIndex);
				System.out.println(tre);
				
			// Word that's just one letter	
			} else if (ordLengde == 1) {
				System.out.println(ord[i]);
				
			// Even length words, keep middle letters
			} else if (ordLengde % 2 == 0){
				int beginIndex = (ordLengde / 2) -1;
				int endIndex = beginIndex + 2;
				String to = ord[i].substring(beginIndex, endIndex);
				System.out.println(to);
			}
			
		}

	}

}
