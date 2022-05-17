
public abstract class Persona {

	private String nombre;
	
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	
	public String dameNombre() {
		
		return nombre;
		
	}
	
	public abstract String dameDescripcion();
	
}

//"UNA CLASE ABSTRACTA ES LA QUE MARCA EL DISEÑO EN LA JERARQUÍA DE LA HERENCIA"
