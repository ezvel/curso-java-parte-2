
public class Jefe extends Empleado { 
	
	private double incentivo;
	
	
	public Jefe(String nombre, double sueldo, int año, int mes, int dia) {
		
		
		super(nombre, sueldo, año, mes, dia); //Llama al constructor padre y le pasa los parámetros
		
	}
	
	public void estableceIncentivo(double incentivo) {
		
		this.incentivo = incentivo;
		
	}
	
	//Sobreescribir el método dame sueldo para sumarle el sueldo al incentivo al jefe
	
	public double dameSueldo() {
		
		double sueldoJefe = super.dameSueldo(); //el super hace que llame a dameSueldo de la clase padre (Empleado)
		
		return sueldoJefe + incentivo;
		
	}
	
	
	
}

/*
public final class Jefe extends Empleado { //final en Jefe para detener la herencia
	
	private double incentivo;
	
	
	public Jefe(String nombre, double sueldo, int año, int mes, int dia) {
		
		
		super(nombre, sueldo, año, mes, dia); //Llama al constructor padre y le pasa los parámetros
		
	}
	
	public void estableceIncentivo(double incentivo) {
		
		this.incentivo = incentivo;
		
	}
	
	//Sobreescribir el método dame sueldo para sumarle el sueldo al incentivo al jefe
	
	public double dameSueldo() {
		
		double sueldoJefe = super.dameSueldo(); //el super hace que llame a dameSueldo de la clase padre (Empleado)
		
		return sueldoJefe + incentivo;
		
	}
	
	
	
}

*/


