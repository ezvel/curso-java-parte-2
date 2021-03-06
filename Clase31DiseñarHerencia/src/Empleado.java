/*
Clase 31 - Diseño de Herencia. Polimorfismo. Enlazado dinámico

POLIMOSFIRMO

Principio de sustitución

	Podemos utilizar un objeto de una subclase
	siempre que el programa espere un objeto de la
	superclase
	Un objeto se puede comportar de diferente forma
	dependiendo del contexto. Las variables objeto
	son polimórficas
	

Vamos a crear un objeto de la clase jefe
que hereda de empleado


Refundición  de objetos. Clases y métodos final




Un jefe siempre es un empleado     <----> Podemos hacer un casting de un objeto jefe de clase empleado a la clase jefe porque un jefe siempre es un empleado
Un empleado no siempre es un jefe  <----> No podemos hacer un casting de un  objeto empleado de clase empleado a la clase jefe porque un empleado no siempre es un jefe

Error:
		
Jefe JefeCompras = (Jefe) misEmpleados[2]; //Error <-> un empleado no siempre es un jefe

Exception in thread "main" java.lang.ClassCastException: class Empleado cannot be cast to class Jefe (Empleado and Jefe are in unnamed module of loader 'app')
	at UsoEmpleados.main(UsoEmpleados.java:31)


Final

Herencia:

Empleado ----  Jefe
                    ----- Director 
                    

"No quiero que ninguna clase más herede de la clase
Jefe. Ni siquiera director"

Empleado ----  [Jefe]
                    ***----- Director ****

Declarando la clase cómo final para cortar la 
cadena de la herencia
         
Un programador que crea una clase para la API de JAVA
y desea que si heredas esa clase y no crees un método
con el mismo nombre y le des un comportamiento
diferente lo establecerá cómo final:

Clase calendar:

public final Date getTime();

Clase String

public final class String


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

public class Empleado {
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private int ID;
	
	private static int IDSiguiente = 1;
	
	
	public Empleado(String nombre, double sueldo, int año, int mes, int dia) {
		
		this.nombre = nombre;
		
		this.sueldo = sueldo;
		
		GregorianCalendar calendario = new GregorianCalendar(año, mes - 1, dia);
		
		this.altaContrato = calendario.getTime();
		
		ID = IDSiguiente;
		
		IDSiguiente++;
						
	}
	
	public Empleado(String nombre) {
		
		//this.nombre = nombre;
		this(nombre, 30000, 2000,01,01); //Sigue teniendo un argumento. Pero al utilizar el this hace referencia al constructor que tiene el número de parámetros que tiene el this(--- --- -- -- --)
		
	}
	
	public String dameNombre() {
		
		return nombre;
		
	}
	
	public int dameId() {
		
		return ID;
		
	}
	
	
	public double dameSueldo() {
		
		return sueldo;
		
	}
	
	
	/*
	public final double dameSueldo() {
		
		return sueldo;
		
	}
	*/
	
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

