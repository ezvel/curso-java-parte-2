package ejemplo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Comparable, Trabajadores {
	
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
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if (this.sueldo < otroEmpleado.sueldo) {
			
			return -1;
			
		}
		
		if (this.sueldo > otroEmpleado.sueldo) {
			
			return 1;
			
		}
		
		return 0;
		
	}
	
	public double estableceBonus(double gratificacion) {
		
		
		return Trabajadores.bonusBase + gratificacion;
		
	}
	
	
	
}

