package paquete1;

import paquete2.Clase1; // Ahora la Clase3 hereda de la Clase1

public class Clase3 extends Clase1 {

	
	
}

/*
Estamos en la clase3, es decir, en una clase
de un paquete distinto a la clase1 dónde se definieron
las variables y los métodos

Cómo hacer para que se herede de la clase1
Para utilizar una clase que esté en otro paquete
y no es el paquete por defecto <- java.lang
Tengo que importarlas para poder utilizarlas

Por lo tanto si quiero utilziar una clase que está
en otro paquete y no es el paquete lang, entonces, tengo
que importarlas


public class Clase3 extends Clase1{} <- no está dentro del mismo paquete y no del lang <- hay que importarla

import paquete Clase

*/