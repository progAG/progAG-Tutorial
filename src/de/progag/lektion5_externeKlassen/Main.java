package de.progag.lektion5_externeKlassen;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * Um ein Programm übersichtlich zu halten, schreibt man nicht alles in eine Klasse.
		 * Es gibt eine Hauptklasse (diese hier) und zusätzliche Klassen. 
		 * In ihnen gibt es wiederum neue Methoden.
		 * Um sie zu benutzen, muss man die Klasse deklarieren.
		 */
		
		Einkaufsliste e = new Einkaufsliste();
		
		/**
		 * Von hier aus kann man jetzt alle Methoden der Klasse "Einkaufsliste" ausführen.
		 */
		
		e.hinzufügen("5l Milch");
		e.hinzufügen("100g Fleisch");
		e.hinzufügen("3 Tomaten");
		
		/**
		 * Man kann auch auf die Variablen einer Klasse zugreifen.
		 */
		
		System.out.println(e.liste); // Die Liste aus der Einkaufsliste-Klasse
		
	}
	
}
