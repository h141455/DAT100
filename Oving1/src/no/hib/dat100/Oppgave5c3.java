package no.hib.dat100;
import java.util.Scanner;

public class Oppgave5c3 {
	
	public static void main(String[] args) {
		
		float x, y;
		
		Scanner tastatur = new Scanner(System.in);
		
		System.out.print("Oppgi verdien til x: ");
		x = tastatur.nextFloat();
		
		System.out.print("Oppgi verdien til y: ");
		y = tastatur.nextFloat();
		
		System.out.println("Produktet av x og y er: " + x*y);
		
		// Avoid resource leaking.
		tastatur.close();
		
		
	}

}
