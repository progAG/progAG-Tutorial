package de.progag.lektion3_wiederholungen;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * Es gibt in Java 2 verschiedene Wiederholungsschleifen.
		 * Die Where-Schleife wird meistens für unendliche Wiederholungen genutzt.
		 * Die For-Schleife wird oft für Wiederholungen benutzt, die ein festgelegtes Ende haben.
		 */
		
		int i = 5;
		
		/**
		 * Die Variable nimmt den Wert an, wie oft sich die Schleife ausführen soll.
		 */
		
		for(int kekse = 0; kekse < i ; kekse++ ) { // Setzt "kekse" auf 0. Wiederhole dich so oft, solange kekse kleiner als i ist. Ändere jedes mal "kekse" um 1.
			
			System.out.println("Es gibt " + kekse +" Kekse.");
			
		}
		
		/**
		 * Man kann auch eine For-Schleife so anlegen, dass die Schleife für jedes Element einer Liste etwas macht.
		 * Dafür benötigt man eine ArrayList<>.
		 * Eine ArrayList ist ein Objekt, welches man, anders als eine Variable, mit "new ArrayList<>()" deklarieren muss.
		 * Danach kann man einzelne Einträge hinzufügen.
		 * In die eckigen Klammern kommt der Objekt-Typ hinein, den du speichern möchtest. Hier sollen Strings in der Liste gespeichert werden.
		 */
		
		ArrayList<String> liste = new ArrayList<String>(); // Eine neue ArrayList wird deklariert.
		
		liste.add("Hans");
		liste.add("Gretel");
		liste.add("Susi");
		
		/**
		 * Die For-Schleife hier sieht viel einfacher aus.
		 */
		
		for(String s : liste) { // Für jeden String "s" aus der Liste "liste" soll folgendes getan werden...
			
			System.out.println("Name: " + s);
			
		}

		/**
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
			 * "try" und "catch" wird in einer anderen Lektion genauer erläutert, hier ist es ohne große Bedeutung.
			 * Der Befehl "Thread.sleep(1000);" benötigt aber einen "try"- und ein "catch"-Block
			 */
			
		}
		
		/**
		 * Hinter eine While-Schleife kann man nichts mehr schreiben, da dieser Code nicht ausgeführt wird. 
		 * Unsere While-Schleife ist ja eine Endlosschleife.
		 */
		
	}
	
}
