package de.progag.lektion6_GUI;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Eine GUI ist ein Benutzerinterface. Allgemein gesagt ist es ein Fenster, was sich öffnet.
	 * Java hat dafür eine Bibliothek namens "Swing".
	 * Ein leeres Fenster, was man öffnen kann, heißt "JFrame" und ist ein Objekt, welches wir brauchen.
	 * Da wir ein neues Fenster (GUI) erstellen, müssen wir hinter "public claas Main" noch "extends JFrame" schreiben, was besagt, dass wir dieses Fenster "kopieren".
	 * Diese Klasse hat jetzt alle Eigenschaften eines JFrames. Man kann es also schon theoretisch öffnen.
	 * "private static final long serialVersionUID = 1L;" muss bei einem JFrame angegeben werden.
	 */
	
	public static void main(String[] args) {
		
		/**
		 * Für ein JFrame muss man Einstellungen vornehmen. Dieses können wir nicht in der Haupt-Methode tun.
		 * Dafür erstellen wir diese Klasse neu.
		 */
		
		new Main();
		
	}
	
	public Main() {
		
		/**
		 * Einige Einstellungen sind sehr wichtig. 
		 * Wenn man ein JFrame schließt, stoppt das Programm nicht automatisch. Außerdem ist es sehr klein.
		 */
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Beim Schließen soll das Programm sich beenden.
		setExtendedState(MAXIMIZED_BOTH); // Das Programm wird maximiert gestartet.
		setLayout(null); // Es wird kein layout verwendet. Es gibt vorgegebene, jedoch kann man ohne besser arbeiten.
		
		setVisible(true); // Letzter Befehl. Das JFrame wird angezeigt.
		
	}
	
}
