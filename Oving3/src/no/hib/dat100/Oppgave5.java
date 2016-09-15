package no.hib.dat100;

import easyIO.*;

public class Oppgave5 {
	public static void main(String[] args){
		
		
		In tast;
		Out skjerm = new Out();
		double[] temp = new double[7];

		skjerm.outln("Analyse av temperaturer");
		skjerm.outln("***********************");
		skjerm.outln("Skriv inn temperaturene:");

		// For-loop for user to input each day of the week
		// Place them in an array, temp 
		for (int i = 0; i <= 6; i++) {
			skjerm.out(i + 1 + ". dag: ");
			tast = new In();
			temp[i] = tast.inDouble();
		}

		// Calculates the total of all temperature 
		// Goes through the created array
		double sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum = sum + temp[i];
		}
		
		// Caluclates the average temperature 
		double round = sum / temp.length;
		skjerm.out("Gjennomsnittstemperaturen var ");
		skjerm.out(round, 2);
		skjerm.outln(" grader.");


		// To start, highest is the first element in the array
		double maks = temp[0];

		// Loop going through each temperature finding the highest one 
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > maks){
				maks = temp[i];
			}
		}

		skjerm.out("Maksimum for uken var " + maks);
		skjerm.outln(" grader");
	}

}
