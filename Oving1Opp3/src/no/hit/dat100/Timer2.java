package no.hit.dat100;

import java.util.Scanner;

public class Timer2 {
	
	
	public static void main(String[] args) {
		
		int brukerSekunder;
		
		// Ask user for amount of seconds.
		Scanner tastatur = new Scanner(System.in);
		System.out.println("Antall sekunder? ");
		
		// Let user enter the amount of seconds.
		brukerSekunder = tastatur.nextInt();
		
		// Calculating the time.
		int antallTimer = brukerSekunder / 60;
		int antallMinutter = brukerSekunder % 60;
		int antallSekunder = brukerSekunder % 60;
		
		// Formating the answer and displaying the result.
		System.out.println(antallTimer + " timer, " + antallMinutter + " minutter, " + antallSekunder + " sekunder.");

		// Avoid resource leaking.
		tastatur.close();
	}

}
