package ejemplo;



public class Jefe extends Empleado implements Jefatura{ 
	
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
	
	
	public String tomarDesiciones(String desicion) {
		
		return "Un miembro de la dirección a tomado la desición de " + desicion;
		
	}
	
	
	public double estableceBonus(double gratificacion) {
		
		double prima = 2000;
		
		return Trabajadores.bonusBase + gratificacion + prima;
		
	}
	
	
}





