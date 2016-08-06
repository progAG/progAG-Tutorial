package de.progag.lektion3_wiederholungen;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * Es gibt in Java 2 verschiedene Wiederholungsschleifen.
		 * Die Where-Schleife wird meistens für unendliche Wiederholungen genutzt.
		 * Die For-Schleife wird oft für Wiederholungen benutzt, die ein festgelegtes Ende haben.
		 * 
		 * Folgende Schleife gibt jede Sekunde eine Nachricht in Endlosschleife in der Konsole aus.
		 */
		
		while(true) {
			
			System.out.println("Ich wiederhole mich!");
			
			try { // Das Programm wartet 1000 Millisekunden, bis es weiter macht.
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
