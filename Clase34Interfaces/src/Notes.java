/*
Interfaces

Directrices que deben cumplir las clases

   --------implementar---->

Interfaz  1 ----->  Clase1

directriz 1         directriz 1
directriz 2         directriz 2

Directriz == métodos


Las interfaces establecen los comportamientos
a cumplir por las clases que implementan
esas interfaces, y esos comportamientos viene
denterminados por los métodos que nos obligan 
a incluir en las clasesque implementa la interfaz de turno

interfaz 1   prefefinidas (API) 
             propias
             
 
interfaz 1  Métodos abstractos
            Constantes
            

	Se almacena en fichero .class
	
	No se puede instanciar (no new)
	
	Todos sus métodos son public y abstract.
	
	Se definen, no se implementan
	
	No tienen variables. Si constantes
	
Si es similar a las clases abstractas, por qué 
las interfaces
	
	Por el problema de herencia simple
	Las clases astractas podrían tener métodos no abstractos
	Las interfaces siempre tienen métodos abstractos
	
Java no puede tener la herencia múltiple, las interfaces
es cómo si supliera este tema


Clase Empleado   --->   Clase Jefe

Interfaz 1      ---->
 
Interfaz 2      ---->

  
Sintaxis  
  
Class Jefe extends Empleado implements interfaz1, interfaz2


En la API de Java las clases que están en cursiva son
interfaces

En la API de Java cuándo vamos a un método x de una clase x
nos podemos encontrar que hay muchos métodos con el mismo
nombre. Esto se debe a la sobrecarga de constructores que
se activará o llamará según el número de parámetros que 
le pasemos

Se quiere ordenar la salida de los empleados 
de menor a mayor en cuánto a los sueldos:


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
	Sueldo: 104750.0
	Fecha de alta: Wed May 26 00:00:00 ART 1999
	ID: 6


Con clases:
Empleado director = new Jefe(-----); <---> polimorfismo


Con interfaces
Comparable ejemplo = new Comparable(); <---> NO SE PUEDE INSTANCIAR

comparable ejemplo = new Empleado();  <----> con polimorfismo sí

PODEMOS UTILIZAR INSTANCEOF PARA SABER  SI UNA INSTANCIA DE TIPO INTERFAZ
PERTENECE A UNA CLASE

if (director instanceof Jefe);       

if (ejemplo instanceof Empleado);


Clase Empleado  ----------  Clase Jefe

Comparable      ---------   Clase Empleado



Interfaces y clases internas

Uso temporizador <-> desencadena una acción cada cierto tiempo
Clase Timer

Timer(int delay, ActionListener listener

--> método  start() <- comienzo del timer

Una clase interna, es una clase dentro de otra <- inner class

Así cómo tenemos bucles dentro de otra, podemos tener
clases dentro de otra


public class Clase1 {

   class Clase2 {
   
   		
   		-----
   	    -----
   
   }  
  
  ----
  ----
	
}

Motivos para crear clases internas

Para poder acceder a los campos privados de una clase desde otra
clase 

Para ocultar una clase de otras pertenecientes al mismo paquete

Para crear clases internas "anonimas" muy utiles para gestionar
eventos y retrollamadas

Cuándo solo una clase debe accedera los campos de ejemplar
de otra clase


Clase interna local

Class  classExterna {
	
	Public void metodo() {
	
		class claseInternaLocal {
		
			codigo clase interna
		
		}
		
		codigo metodo
	
	}
	
	
	codigo clase externa

}




*/