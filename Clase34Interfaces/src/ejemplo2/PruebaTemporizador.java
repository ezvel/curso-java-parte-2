package ejemplo2;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;



public class PruebaTemporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente = new DameLaHora(); // <- estamos usando el constructor por defecto
		 /*
		Timer miTemporizador = new Timer(5000, oyente);
		
		miTemporizador.start();
		*/
		

		//ActionListener oyente = new DameLaHora();
	}

}

class DameLaHora implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		
		System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
		
	}
	
}
