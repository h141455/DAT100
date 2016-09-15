package no.hib.dat100;

import easyIO.*;

public class Oppgave3 {

	public static void main(String[] args) {
		
		// Solution using pow
		int n;
		double x;
		System.out.print("Tast inn en verdi for x: ");
		In xInn = new In();
		x = xInn.inDouble();

		do {
			System.out.print("Tast inn en verdi for n: ");
			In nInn = new In();
			n = nInn.inInt();
		} while (n < 0);

		double i = Math.pow(x,n);
		System.out.println("\n" + "x^n = " + i + " (Ved bruk av pow)");

		
		// Solution using while loop
		int start = 0;
		double svar = 1;

		while (start < n) {
			svar = svar * x;
			start++;
		}	

		System.out.println("x^n = " + svar + " (ved bruk av while-løkken)");

	}

}
