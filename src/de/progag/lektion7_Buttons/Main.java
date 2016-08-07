package de.progag.lektion7_Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Jetzt wollen wir Buttons auf dem Fenster hinzuf�gen.
	 * Daf�r ben�tigt man einen JButton, den man deklarieren muss.
	 * In den Klammern kann man angeben, welcher Text auf dem Button steht.
	 * Au�erdem muss ein ActionListener implementiert werden, um ihn benutzen zu k�nnen.
	 * Mit dem ActionListener k�nnen wir abfragen, wann ein Button gedr�ckt wurde.
	 */
	
	public JButton b = new JButton("Klick!");
	public JPanel 
	
	public static void main(String[] args) {
		
		new Main();
		
	}
	
	public Main() {
		
		/**
		 * Wir sagen dem Button, dass er diese Klasse als ActionListener benutzen soll.
		 * Der ActionListener wurde ja implementiert.
		 */
		
		b.addActionListener(this);
		b.setBounds(10, 10, 100, 40);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setLayout(null);
		
		setVisible(true);
		
	}
	
	/**
	 * Die Methode actionPerformed ist vorgegeben. Genau so das @Override, welches sagt, dass die Methode die alte �berschreibt.
	 * Man muss nur abfragen, ob es der Button "b" war, der gedr�ckt wurde.
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b) { // Falls die "Quelle" des Klicks das Objekt "b" (Button) ist, dann...
			
			System.out.println("Ich wurde geklickt!");
			
		}
		
	}
	
}
