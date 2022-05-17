package paquete2;

import paquete1.Clase3;

public class Clase2 {

	public static void main(String[] args) {
	
		Clase1 miObj1 = new Clase1(); // <- Modificador por defecto en la Clase1
		
		miObj1.miMetodo();
		
		Clase3 miObj2 = new Clase3(); // <- impprtamos paquete1 clase3
		
		//(miObj2. <- Estoy intentando acceder desde la clase3 a la clase1. La clase3 es una subclase que está en un paquete diferente. La clase1 tiene un método con un modificador por defecto
		miObj2.miMetodo(); // Ahora puedo acceder porque la variable1 tiene el proyected. Puedo acceder desde otro paquete importandolo pero no de las demás clases del proyecto
	
	}

}
