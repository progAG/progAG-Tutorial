package de.progag.lektion1_grundgeruest;

public class Main {
	
	/**
	 * Willkommen beim Java-Tutorial
	 * v. 1.0
	 * by Mathis Neunzig (DrBackmischung)
	 * 
	 * Jedes Projekt benötigt eine Hauptklasse. Bei kleinen Projekten gibt es generell nur eine Klasse.
	 * In der Hauptklasse muss ein Grundgerüst vorhanden sein, ohne das das Programm nicht startet.
	 */
	
	public static void main(String[] args) {
		
		/**
		 * Das hier muss in jede Hauptklasse. Von dieser Klasse aus wird alles gesteuert.
		 * Was hier drin steht, wird beim Starten ausgeführt.
		 * Hinter jede Methode kommt ein Semikolon. Beim Erstellen von Methoden, muss man den Inhalt in geschweifte Klammern schreiben.
		 */
		
		System.out.println("Hello World!");
		
		/**
		 * System.out.println(String) ist eine Methode, mit der man etwas in die Konsole schreiben kann.
		 * "String" muss durch einen String ersetzt werden.
		 * Ein String ist allgemein eine Variable, genauer eine Zeichenfolge. Er kann aus Buchstaben, Zahlen oder beidem bestehen.
		 */
		
		String string = "Dieter";
		
		/**
		 * Um einen String zu erstellen, muss die Zeichenfolge in Ausrufungszeichen gesetzt werden.
		 * Generell erstellt ("deklariert") man eine Variable wie folgt:
		 * [Was will man deklarieren (String, etc.)] [Name der Variable] = [Wert der Variable]
		 * String									 neuerString         = "Apfel"
		 */
		
		String neuerString = "Apfel";
		
		/**
		 * Es gibt viele verschiedene Variablen.
		 */
		
		// Ganze Zahlen
		
		byte b = 54; // Zahlen von -128 bis 127 (1 Byte)
		short s = 3000; // Zahlen von -32768 bis 32767 (2 Byte)
		int i = 61739; // Zahlen von -2147483648 bis 2147483647 (4 Byte) <= Wird normalerweise benutzt
		long l = 81274839; // Zahlen von -2147483648^2 bis 2147483647^2 (8 Byte)
		
		// Fließkommazahlen
		
		float f = 0.417f; // Kommazahlen, hinter der Zahl muss ein "f" stehen (4 Byte)
		double d = 0.812647813654; // Viel genauere Kommazahl (8 Byte) <= Wird normalerweise benutzt
		
		// Wahrheitswerte
		
		/**
		 * Ein Boolean ist eine Variable, die den Wert "Ja" (true) und "Nein" (false) annehmen kann.
		 * Jedoch kann der Wert auch "null" (=> leer) sein. Dann gibt es meistens Fehler. (1 Byte)
		 */
		
		boolean istHungrig = false;
		boolean istDurstig = true;
		
		// Zeichen
		
		char c = 'A'; // Ein einzelnes Zeichen (2 Byte)
		
		/**
		 * Mit "Zahlen-Variablen" kann man ganz einfach rechnen. Anstatt von Zahlen kann man andere Variablen einfügen.
		 */
		
		double summe = 5.3 + 7.8162;
		int andereSumme = i + 516;
		
		/**
		 * Variablen kann man verändern, indem man sie neu deklariert.
		 */
		
		s = 2500;
		l = b + 617258365;
		
		/**
		 * Alle Variablen können in der Konsole ausgegeben werden.
		 */
		
		System.out.println("Zahlen: " + b + ", " + i + ", " + f);
		System.out.println("Mehr Zahlen: " + summe + ", " + andereSumme);
		System.out.println("Summe einiger Zahlen: " + b + i + s + l + d);
		System.out.println("Zeichen: " + c);
		System.out.println("Hungrig: " + istHungrig + ", durstig: " + istDurstig);
		System.out.println(string + " isst einen " + neuerString + ".");
		
	}
	
}
