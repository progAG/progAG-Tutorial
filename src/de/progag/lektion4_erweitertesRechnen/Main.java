package de.progag.lektion4_erweitertesRechnen;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * Java kann noch mehr, als nur die Grundrechenarten.
		 * Für einige besonderen Rechenoperationen gibt es eigene Befehle.
		 * Dafür benutzt man die Klasse "Math" aus der Java-Bibliothek und führt die Befehle aus.
		 */
		
		// Wurzel
		double w = Math.sqrt(9); // Wurzel aus 9
		System.out.println(w);
		
		// Potenzen
		double p = Math.pow(3, 4); // 3 hoch 4
		System.out.println(p);
		
		// Sinus
		double s = Math.sin(50); // Sinus von 50
		System.out.println(s);
		
		// Cosinus
		double c = Math.cos(40); // Cosinus von 40
		System.out.println(c);
		
		// Tangens
		double t = Math.tan(30); // Tangens von 30
		System.out.println(t);
		
		// Runden
		long l = Math.round(50.45); // Rundet 50.45 auf eine ganze Zahl (Long muss ganzzahlig sein)
		System.out.println(l);
		
		/**
		 * Eine Zufallszahl ist immer ein Double. Man kann die Zahl aber auch runden, dann ist es ein Long.
		 * Man muss eine +1 am Schluss schreiben, da Java bei 0 beginnt zu zählen.
		 */
		
		long zufallszahl = Math.round(Math.random()*30)+1; // Zufallszahl zwischen 1 und 30
		System.out.println(zufallszahl);
		
	}
	
}
