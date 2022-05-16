

public class UsoEmpleados {

	public static void main(String[] args) {
		
		Jefe jefeRRHH = new Jefe("Fabio Mora", 80000, 2000, 06, 19);
		
		jefeRRHH.estableceIncentivo(20000);
		
		
		
		Empleado[] misEmpleados = new Empleado[6]; 
		
		misEmpleados[0] = new Empleado("Carlos Lopez", 63000, 2000, 05, 23);
		
		misEmpleados[1] = new Empleado("Ana Gutierrez", 81000, 2008, 06, 03);
		
		misEmpleados[2] = new Empleado("Juan Martinez", 63000, 2010, 10, 23);
		
		misEmpleados[3] = new Empleado("Gabriel Perez");
		
		misEmpleados[4] = jefeRRHH; //Polimorfismo o principio de sustitución <- Podemos almacenar objetos de la superclase u objetos de la subclase
		
		misEmpleados[5] = new Jefe("Carla Rodriguez", 95000, 1999, 5, 26);
		
	

	
	for(int i = 0; i < misEmpleados.length; i++) {
		
		misEmpleados[i].subeSueldo(5);
		
	}
	
	for(int i = 0; i < misEmpleados.length; i++) { //La variable i se comporta de distintas formas según el contexto. Llama al objeto de la superclase, pero en jefes llama al objeto de la subclase. Enlazado dinámico <- la jvm es capáz en tiemp de ejecución a qué método tiene que llamar
		
		System.out.println("Nombre: " + misEmpleados[i].dameNombre() + 
				"\n" + "Sueldo: " + misEmpleados[i].dameSueldo() +
				"\n" + "Fecha de alta: " + misEmpleados[i].dameFechaContrato() +
				"\n" + "ID: " + misEmpleados[i].dameId());
		
		System.out.println("");
		
	}
  }
}

/*

SALIDA

Nombre: Carlos Lopez
Sueldo: 66150.0
Fecha de alta: Tue May 23 00:00:00 ART 2000
ID: 2

Nombre: Ana Gutierrez
Sueldo: 85050.0
Fecha de alta: Tue Jun 03 00:00:00 ART 2008
ID: 3

Nombre: Juan Martinez
Sueldo: 66150.0
Fecha de alta: Sat Oct 23 00:00:00 ART 2010
ID: 4

Nombre: Gabriel Perez
Sueldo: 31500.0
Fecha de alta: Sat Jan 01 00:00:00 ARST 2000
ID: 5

Nombre: Fabio Mora
Sueldo: 104000.0
Fecha de alta: Mon Jun 19 00:00:00 ART 2000
ID: 1

Nombre: Carla Rodriguez
Sueldo: 99750.0
Fecha de alta: Wed May 26 00:00:00 ART 1999
ID: 6



*/
