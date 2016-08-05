package de.progag.lektion2_ifelse;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * Mit einer If-Schleife kann man abfragen, ob eine Bedingung zutrifft.
		 * Man kann Variablen ganz einfach vergleichen.
		 */
		
		int birnen = 7;
		int orangen = 9;
		
		/**
		 * Die erste Bedingung ist erfüllt, aber die zweite nicht.
		 * Also wird nur der Code der ersten If-Schleife ausgeführt.
		 * 
		 * Bei Vergleichen von zwei Variablen werden immer zwei Zeichen benötigt.
		 */
		
		if(birnen == 7) { // Falls "birnen" = 7 ist -> true
			
			System.out.println("Es gibt " + birnen + " Birnen!");
			
		}
		
		if(orangen == 7) { // Falls "orangen" = 7 ist -> false
			
			System.out.println("Es gibt " + orangen + " Orangen!");
			
		}
		
		/**
		 * Wichtige Operatoren sind:
		 * == (gleich)
		 * != (nicht gleich)
		 * < (kleiner als...)
		 * > (größer als...)
		 * <= (kleiner gleich...)
		 * >= (größer gleich...)
		 */
		
		if(birnen <= orangen) {
			
			System.out.println("Es gibt weniger Birnen als Orangen :C");
			
		}
		
		/**
		 * Man kann auch mehrere Bedinungen in eine If-Schleife abfragen.
		 * Diese werden mit && (und) oder || (oder) verbunden.
		 */
		
		if(birnen == 7 && orangen == 9) {
			
			System.out.println("Es gibt 7 Birnen und 9 Orangen");
			
		}
		
		if(birnen == 4 || orangen > birnen) {
			
			System.out.println("Es gibt entweder 4 Birnen oder es gibt mehr Orangen als Birnen");
			
		}
		
		/**
		 * Wenn eine Bedinung NICHT erfüllt wurde, kann man jedoch sagen, was dann passieren soll.
		 * Das macht man mit der Ergänzung der Else-Schleife.
		 */
		
		double d = 10.5;
		int i = 5;
		
		if(d + i == 12) { // Falls d + i = 12 ist, dann...
			
			System.out.println("Das Ergebnis ist 12!");
			
		} else { // Aber falls d + i NICHT 12 ist, dann...
			
			System.out.println("Das Ergebnis ist nicht 12!");
			
		}
		
		/**
		 * Man kann auch mehrere Bedingungen untereinander abfragen, indem man hinter einem "else" ein neues "if" setzt.
		 */
		
		String farbe = "Rot";
		
		if(farbe == "Grün") {
			
			System.out.println("Die Farbe ist Grün!");
			
		} else if(farbe == "Gelb") {
			
			System.out.println("Die Farbe ist Gelb!");
			
		} else if(farbe == "Rot") {
			
			System.out.println("Die Farbe ist Rot!");
			
		} else if(farbe == "Blau") {
			
			System.out.println("Die Farbe ist Blau!");
			
		}
		
		/**
		 * Das ist aber nicht immer so sinnvoll, da man auch einfach die Variable "farbe" auslesen kann.
		 */
		
		System.out.println("Die Lieblingsfarbe von meiner Katze ist " + farbe + ".");
		
		/**
		 * Die einfachste Art der If-Schleife ist, wenn man einen Boolean überprüft.
		 * Man kann einfach einen Boolean einsetzen.
		 */
		
		boolean istMüde = true;
		
		if(istMüde) { // Falls "istMüde" true ist, dann...
			
			System.out.println("Ich bin müde!"); // -> positiv!
			
		}
		
		/**
		 * Eine Verneinung kann man mit einem ! vor der Bedingung erreichen.
		 */
		
		if(!istMüde) {
			
			System.out.println("Ich bin nicht müde!"); // -> negativ!
			
		}
		
	}
	
}
