
public class UsoPersona {

	public static void main(String[] args) {
		
		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado("Luis Conde", 5000, 2008, 04, 24);
		lasPersonas[1] = new Alumno("Roberto", "Arquitectura");
		
		for(Persona p: lasPersonas) {
			
			System.out.println(p.dameNombre() + "," + p.dameDescripcion());
			
		}
		
	}

}

/*

Salida

Luis Conde,Este empleado tiene un id = 1. Con un sueldo = 5000.0
Roberto,Este alumno está estudiando la carrera de: Arquitectura

*/
