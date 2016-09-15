package no.hib.dat100;

import easyIO.*;

public class Oppgave4 {

	public static void main(String[] args) {
		Out skjerm = new Out();
		skjerm.outln("x i grader | x i radianer | sin(x) | cos(x)");
		String strek = "--------------------------------------------";
		skjerm.outln(strek);
		
		// Distances
		final int BREDDE = 6;
		final int BREDDE1 = 15;
		final int BREDDE2 = 12;
		final int BREDDE3 = 9;
		
		// Variables 
		double grader = 0;
		double radianer;
		double sinus;
		double cosinus;
		
		// Do-while-loop to go through all the degrees
		 do {
			radianer = Math.toRadians(grader);
			sinus = Math.sin(radianer);
			cosinus = Math.cos(radianer);
			
			skjerm.out(grader, 0, BREDDE);
			skjerm.out(radianer, 2, BREDDE1);
			skjerm.out(sinus, 2, BREDDE2);
			skjerm.outln(cosinus, 2, BREDDE3);
			
			// Gradually increases the degrees by 15.
			grader = grader + 15;
			
		} while (grader <= 180);
		 
		skjerm.outln(strek);
	}

}
