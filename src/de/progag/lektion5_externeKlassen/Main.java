package de.progag.lektion5_externeKlassen;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * Um ein Programm �bersichtlich zu halten, schreibt man nicht alles in eine Klasse.
		 * Es gibt eine Hauptklasse (diese hier) und zus�tzliche Klassen. 
		 * In ihnen gibt es wiederum neue Methoden.
		 * Um sie zu benutzen, muss man die Klasse deklarieren.
		 */
		
		Einkaufsliste e = new Einkaufsliste();
		
		/**
		 * Von hier aus kann man jetzt alle Methoden der Klasse "Einkaufsliste" ausf�hren.
		 */
		
		e.hinzuf�gen("5l Milch");
		e.hinzuf�gen("100g Fleisch");
		e.hinzuf�gen("3 Tomaten");
		
		/**
		 * Man kann auch auf die Variablen einer Klasse zugreifen.
		 */
		
		System.out.println(e.liste); // Die Liste aus der Einkaufsliste-Klasse
		
	}
	
}
