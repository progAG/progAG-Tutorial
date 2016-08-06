package de.progag.lektion3_wiederholungen;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * Es gibt in Java 2 verschiedene Wiederholungsschleifen.
		 * Die Where-Schleife wird meistens f�r unendliche Wiederholungen genutzt.
		 * Die For-Schleife wird oft f�r Wiederholungen benutzt, die ein festgelegtes Ende haben.
		 * 
		 * Folgende Schleife gibt jede Sekunde eine Nachricht in Endlosschleife in der Konsole aus.
		 */
		
		while(true) {
			
			System.out.println("Ich wiederhole mich!");
			
			try { 
				Thread.sleep(1000); // Das Programm wartet 1000 Millisekunden, bis es weiter macht.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			/**
			 * "try" und "catch" wird in einer anderen Lektion genauer erl�utert, hier ist es ohne gro�e Bedeutung.
			 * Der Befehl "Thread.sleep(1000);" ben�tigt aber einen "try"- und ein "catch"-Block
			 */
			
		}
		
	}
	
}
