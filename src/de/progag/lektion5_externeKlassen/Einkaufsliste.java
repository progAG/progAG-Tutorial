package de.progag.lektion5_externeKlassen;

import java.util.ArrayList;

public class Einkaufsliste {
	
	ArrayList<String> liste = new ArrayList<String>();
	
	/**
	 * Eine neue Methode besteht aus "public" und "void".
	 * Dahinter kommt der Name und in Klammern ggf. die Variablen, die mitgegeben werden m�ssen.
	 * In dem Fall ist es ein String.
	 */
	
	public void hinzuf�gen(String s) {
		
		liste.add(s);
		
	}
	
}
