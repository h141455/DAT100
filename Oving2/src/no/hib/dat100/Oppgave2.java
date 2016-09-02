package no.hib.dat100;

import java.util.Scanner;

public class Oppgave2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, z, currentHigh;
		
		Scanner tastatur = new Scanner(System.in);
		
		System.out.print("Enter your first integer: ");
		x = tastatur.nextInt();
		
		currentHigh = x;
		
		System.out.print("Enter your second integer: ");
		y = tastatur.nextInt();
		
		if (y > currentHigh) {
			currentHigh = y;
		}
		
		System.out.print("Enter your third integer: ");
		z = tastatur.nextInt();
		
		if (z > currentHigh) {
			currentHigh = z;
		}
		
		System.out.println("The highest integer was: " + currentHigh);
		
		//Avoid resource leaking.
		tastatur.close();
	}

}
