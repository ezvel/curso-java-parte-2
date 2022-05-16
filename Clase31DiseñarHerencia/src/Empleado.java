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

