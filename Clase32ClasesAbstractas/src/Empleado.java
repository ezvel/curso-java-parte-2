/*

Herencia. Clases abstractas

persona
   	    Empleado
                 Jefe
                       Director

Clase que más cosas puede hacer <-> Director <-> porque más métodos tiene
Es la que está más por debajo

Según subimos en la jerarquía de herencia 
	 menos métodos
	 menos cosas puede hacer
	 menos capáz
	 menos especializadas
	 más genéricas
	 más abstractas

 
					Persona ¿dameSueldo()? -> No siempre               
					         dameNombre() -> Si siempre 
					         dameDescripción()               
                                                  
Alumno		     				Empledos dameSueldo() 
dameNombre()							 dameNombre() -> hereda de persona 
dameDescripción()  			             dameDescripción()  						                          
									                          Jefe dameSueldo()
									                          dameNombre()
									                          dameDescripción()            
									                                              Director dameSueldo()
									                                              dameNombre()
					                                                              dameDescripción()  

El tema es que descripción será diferente a todos los objetos a diferencia de nombre
Un alumno no tiene los mismos campos que un empleado hacia abajo para hace la descripción

Declarar el método descripción cómo método abstracto

	public abstract String dameDescripcion(); <- No lleva nada en su interior. Se define

Se está obligado a declarar abstracto también a la clase
con tan solo una clase abstracta en su interior

	abstract class Persona{...}

Esto significa que todas las clases por debajo que hereden
de la clase abstracta y quieran utilizar un método
abstracto están obligadas a sobreescribir el método, en este caso,
dameDescripción()

	public String dameDescripcion {...}
	
Crea un patrón de diseño que se debe seguir en su jerarquía
de herencia


*/
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona{
	
	private double sueldo;
	
	private Date altaContrato;
	
	private int ID;
	
	private static int IDSiguiente = 1;
	
	
	public Empleado(String nombre, double sueldo, int año, int mes, int dia) {
		
		super(nombre);
		
		this.sueldo = sueldo;
		
		GregorianCalendar calendario = new GregorianCalendar(año, mes - 1, dia);
		
		this.altaContrato = calendario.getTime();
		
		ID = IDSiguiente;
		
		IDSiguiente++;
						
	}
	
	
	public int dameId() {
		
		return ID;
		
	}
	
	public String dameDescripcion() {
		
		return "Este empleado tiene un id = " + ID + ". Con un sueldo = " + sueldo;
		
	}
	
	
	public double dameSueldo() {
		
		return sueldo;
		
	}
	
	
	
	public Date dameFechaContrato() {
		
		return altaContrato;
		
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento = (this.sueldo * porcentaje) / 100;
		
		sueldo+=aumento;
		
	}
	
	public static int dameIDSiguiente() {
		
		return IDSiguiente;
		
	}
	
	
}

