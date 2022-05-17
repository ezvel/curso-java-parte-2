package paquete2;

public class Clase1 {

	protected int miVar1 = 5;
	
	int miVar2 = 7;
	
	protected String miMetodo() {
		
		return "El valor de miVar2 es " + miVar2;
		
	}
	
	/*
	public Clase1() { -> Es el constructor por defecto, ya que no se ha creado uno.
		
	Al tener un modificador por defecto, podemos acceder a esas variables y métodos desde la propia clase
	Desde una clase dentro del mismo paquete por ejemplo desde la clase2. Pero no se puede acceder
	desde una sublcase desde otro paquete diferente. 
	
	NO PERMITE ACCEDER DESDE UNA SUBLCASE DESDE UN PAQUETE DIFERENTE
		
	SI LE PONEMOS UN PROTECTED PODEMOS ACCEDER DESDE CLASE3 A CLASE1 DISTINTOS PAQUETES PERO NO DE TODOS LOS SITIOS
	}
	*/
	
}
