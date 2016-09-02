package no.hib.dat100;

import java.util.Scanner;

public class Oppgave3 {
	
	public static void main(String[] args) {
		
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Skriv nummeret på bydelen: ");
		
		int norgeBy = tastatur.nextInt();
		
		while ((0 >= norgeBy) || (norgeBy > 15)) {
			System.out.println("Venligst prøv igjen. ");
			System.out.print("Skriv nummeret på bydelen: ");
			
			norgeBy = tastatur.nextInt();
		} 
		
		switch (norgeBy) {
			case 1:
				System.out.println("Bydel " + norgeBy + " heter Oslo");
				break;
				
			case 2:
				System.out.println("Bydel " + norgeBy + " heter Gründerløkka");
				break;
				
			case 3:
				System.out.println("Bydel " + norgeBy + " heter Sagene");
				break;
				
			case 4:
				System.out.println("Bydel " + norgeBy + " heter St. Hanshaugen");
				break;
				
			case 5:
				System.out.println("Bydel " + norgeBy + " heter Frogner");
				break;
				
			case 6:
				System.out.println("Bydel " + norgeBy + " heter Uller");
				break;
				
			case 7:
				System.out.println("Bydel " + norgeBy + " heter Vestre Aker");
				break;
				
			case 8:
				System.out.println("Bydel " + norgeBy + " heter Nordre Aker");
				break;
				
			case 9:
				System.out.println("Bydel " + norgeBy + " heter Bjerke");
				break;
				
			case 10:
				System.out.println("Bydel " + norgeBy + " heter Grorud");
				break;
				
			case 11:
				System.out.println("Bydel " + norgeBy + " heter Stovner");
				break;
				
			case 12:
				System.out.println("Bydel " + norgeBy + " heter Alna");
				break;
				
			case 13:
				System.out.println("Bydel " + norgeBy + " heter Østensjø");
				break;
				
			case 14:
				System.out.println("Bydel " + norgeBy + " heter Nordstrand");
				break;
				
			case 15:
				System.out.println("Bydel " + norgeBy + " heter Søndre Nordstand");
				break;
			
		} // End Switch
		
		
		tastatur.close();
		
	}

}
