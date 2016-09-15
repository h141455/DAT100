package no.hib.dat100;

import java.util.Scanner;

public class Oppgave1 {

	public static void main(String[] args) {
		
		// Variabler
		int poengsum, antallElever; 
		
		// Scanner
		Scanner tastatur = new Scanner(System.in);
		
		System.out.print("Antall elever? ");
		
		// Amount of students by user input
		antallElever = tastatur.nextInt();

		// Go through each student, in a do-while-loop
		for (int i = 1; i <= antallElever; i++){
			do {

				System.out.print("Oppgi karakter til student " + i + ": ");
				poengsum = tastatur.nextInt(); 

				if (poengsum <0 || poengsum > 100) {

					System.out.println("Ugylding poengsum, prøv igjen. " + "\n");
					i--;

				}
			
			// While the student score is between 0 and 100.
			} while (poengsum >= 100 && poengsum <= 0);

			
			// Score requirements
			if(poengsum >= 90 && poengsum <= 100){
				System.out.println("Student " + i + ": A" + "\n");
			} 

			if(poengsum >= 80 && poengsum <= 89 ){
				System.out.println("B" + "\n");
			} 

			if(poengsum >= 60 && poengsum <= 79){
				System.out.println("C" + "\n");
			} 

			if(poengsum >= 50 && poengsum <= 59){
				System.out.println("D" + "\n");
			} 

			if(poengsum > 40 && poengsum <= 49){
				System.out.println("E" + "\n");
			} 

			if(poengsum >= 0 && poengsum <= 39){
				System.out.println("F" + "\n");
			} 

		}
		
		// Avoid resource leaking
		tastatur.close();

	} 

}
