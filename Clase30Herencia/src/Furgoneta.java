/*Cómo le decimos a esta clase que herede de otra clase?
 * 
 * public class Furgoneta extends Coche {
 * 
 *  ...
 *  ...
 *  ...
 * }
 * 
 * Ahora la clase Coche es superclase
 * 
 * 
 *   Coche     ---> Furgoneta
 * SuperClase  --->  SubClase
 * ClasePadre  --->  ClaseHijo
 * 
 * Java no admite la herencia multiple, es decir, que admita herencia de más de una clase
 * Para ello en Java se inventó el tema de las interfaces para suplir la herencia múltiple
 * 
 * */


public class Furgoneta extends Coche {
	
	//variables diferente de coche
	private int capacidadCarga;
	private int plazasExtra;
	
	//Estado inicial <- constructor
	
	public Furgoneta(int capacidadCarga, int plazasExtra) {
		
		//super() <- llama al constructor de la clase padre, osea de la superclase. De esta manera llama a la clase padre para heredear su estad inicial
		super();
		this.capacidadCarga = capacidadCarga;
		this.plazasExtra = plazasExtra; 
		
	}
	
	//GETTER
	public String dimeDatosFurgoneta() {
		
		return "La capacidad de carga es: " + capacidadCarga + "\n" +
		"Las plazas son: " + plazasExtra;
		
	}
	
	
	
}


















