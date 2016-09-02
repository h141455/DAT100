package no.hib.dat100;

public class Oppgave1 {
	
	public static void main(String[] args) {
		
		int i;
		
		System.out.println("Test av repetisjonssetning.");
		System.out.println("***************************");
		
		i = 1;
		
		while (i <= 10) {
			System.out.println("Dette er linje nr. " + i);
			
			if (i == 4) {
				System.out.println();
			}
			
			if (i == 8) {
				System.out.println();
			}
			
			i = i + 1;
		}
	}
}


/* Forventer at den teller til 10 med 
 * et ekstra mellomrom etter linje 4 og 8. */
 
