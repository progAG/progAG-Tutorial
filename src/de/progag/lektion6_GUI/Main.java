package de.progag.lektion6_GUI;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	public static void main(String[] args) {
		
		new Main();
		
	}
	
	public Main() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Beim Schlieﬂen soll das Programm sich beenden.
		setExtendedState(MAXIMIZED_BOTH); // Das Programm wird maximiert gestartet.
		setLayout(null); // Es wird kein layout verwendet. Es gibt vorgegebene, jedoch kann man ohne besser arbeiten.
		
		setVisible(true); // Letzter Befehl. Das JFrame wird angezeigt.
		
	}
	
}
