
public class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nombre, String carrera) {
		
		super(nombre);
		
		this.carrera = carrera;
		
	}
	
	public String dameDescripcion() {
		
		return "Este alumno está estudiando la carrera de: " + carrera;
		
	}
	
	
	
}
