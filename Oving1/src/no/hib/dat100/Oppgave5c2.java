package no.hib.dat100;
import easyIO.*;

public class Oppgave5c2 {

	public static void main(String[] args) {

		System.out.print(Format.alignLeft("Bilmerke ", 10));
		System.out.print(Format.center("Årsmodell ", 15));
		System.out.println(Format.center("Reg.nr. ", 15));
		
		System.out.println("------------------------------------");
		
		System.out.print(Format.alignLeft("Mercedes", 10));
		System.out.print(Format.center("1999", 10));
		System.out.println(Format.center("UE65660", 25));
		
		System.out.print(Format.alignLeft("Ford", 10));
		System.out.print(Format.center("2003", 10));
		System.out.println(Format.center("ZE95523", 25));
		
		System.out.print(Format.alignLeft("Toyota", 10));
		System.out.print(Format.center("2006", 10));
		System.out.println(Format.center("DK53401", 25));
		
		System.out.println("------------------------------------");

	}
}