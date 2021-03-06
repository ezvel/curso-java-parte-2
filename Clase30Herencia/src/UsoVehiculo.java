/*
 * Clase 30 - Herencia
 * 
 * Utilizamos el proyecto coches pero en un mismo archivo
 * 
 * Es la capacidad de los hijos de heredar propiedades y funcionalidades de los padres
 * 
 * El padre hereda del abuelo y el abuelo de los padres
 * 
 * Por lo tanto todo hijo tendrán características de los padres
 * Por lo tanto todo hijo tendrá también sus propias características
 * 
 * abuelo ---->  padre  ------> hijos
 *    a    --->   a, b  -------> a, b, c, d, e
 * 
 * La herencia son las cosas comunes que se tienen bajando
 * por el árbol genealógico. Cada uno tendŕan características
 * propias pero también características comunes dada por la herencia
 * 
 * El abuelo tiene a. El padre entonces tiene a, pero también b. Pero el abuelo no tiene b.
 * El hijo entonces tiene a y b. Pero también tiene c, d y e. Ni el abuelo ni el padre tienen c, d ni e.
 * 
 * En la programación podemos tener una clase con características
 * que aplicaran a los objetos que salen de su propio molde
 * 
 * Cada objeto podrá tener sus características propias pero cada objeto tendrá características comunes debido a que salieron de la misma clase o molde
 * 
 * De la misma manera puedo crear otro molde o clase que pertenecerá a otra clases de objeto
 * Pese a ello, esta nueva clase puede tener ciertas características de la clase anterior
 * En vez de tener que escribir de nuevo el código debido a que estamos desarrollando una nueva clase,
 * podemos reutilizar la clase anterior heredando sus propiedades
 * 
 *  clase Coche -->herencia---> objeto coche1 + propiedaes propias
 *                         ---->objeto coche2 + propiedaes propias
 *              
 *              -->herencia---> clase Furgoneta  + propiedaes propias   ---> objeto furgoneta1 + propiedaes propias      > REUTILIZAR (CARACTERÍSTICAS, ESTADO INICIAL, MÉTODOS)
 *       
 *                                   				                    ---> objeto furgoneta2 + propiedaes propias      >                                               
 *   
 *  
 *                                
 *                                                                          
 * """
 *                                                                  
 * Diseño de la herencia. La regla "Es un...
 * 
 * 
 * """
 * 
 * Coche               --->    "¿Una subclase es una superclase?"
 * 
 * Furgoneta           --->    "¿Una furgoneta es un coche?"
 * 
 * Quedaría mejor:     --->     Una furgoneta es un vehículo
 * 
 *                     --->     Un coche es un vehículo
 * 
 * 
 * 
 * Vehículo   ---> Coche      ---> motor + color + peso + características propias  ---> Un coche es un vehículo
 *            ---> Furgoneta  ---> motor + color + peso + características propias  ---> Una furgoneta es un vehículo
 *            ---> Camión     ---> motor + color + peso + características propias  ---> Un camión es un vehículo
 *            ---> Moto       ---> motor + color + peso + características propias  ---> Una moto es un vehículo
 *            
 * Todos los vehículos tendrán:  motor
 *                               color
 *                               peso
 * 
 *            
 * */

// Si quiero ejecutar los estados inciales de la superclase con más de un argumento colocar entre paréntesis del super los argumentos super(arg1, arg2, arg3)
// Una cosa es la herencia y otra la ejecución. super no hereda eso se hace automaticamente, super permite su ejecución
//No puede haber herencias múltiples pero si herencias en cadena. Si una clase hereda de Furgonete hereda también las propiedades de Coche -> por cadena


import javax.swing.*; //Se utilizará JOptionPane

public class UsoVehiculo {

	public static void main(String args[]) {
		
		//Coche Coche = new Coche(); // <- instanciar la clase
		
		/*
		//System.out.println(Coche1.ruedas); <- no puedo obtener una propiedad encapsulada
		System.out.println(Coche.dimeDatosGenerales()); // <- obtengo propiedad encapsulada porque se me dio el permiso
		
		//Coche1.estableceColor("azul"); // si comentamos esta linea nos devuelve null porque la variable colo está vacia y el método setter si se comenta no convocaráa al método
		Coche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		
		//Coche1.color = "verde"; //Estoy modificando el color. Es azul o verde <- nunca podemos modificar la propiedad de un objeto desde su instancia <- no se puede violar el concepto de encapsulación <- tenemos que encapsular las prpiedades cómo color para que sea manipulada dentro de setters
		
		//Los métodos getters y setters son cómo los cables de conexión que permite obtener o modificar propiedades. En la linea anterior estabamos modificando estas propiedades sin pasar por los canales correspondientes. Por ese motivo se es necesario el concepto de encapsulamiento
		
		//Coche1.establecerAsientos(4);
		Coche.establecerAsientos(Integer.parseInt(JOptionPane.showInputDialog("Cantidad de asientos")));
		Coche.establecerClimatizador(true);
		
		System.out.println(Coche.dimeColor());
		System.out.println(Coche.dimeAsientos());
		System.out.println(Coche.dimeClimatizador());
		//No fue necesario llamar a un setter porque las dos lineas de abajo se construyó un getter y setter a la vez para establecer y obtener tanto el peso cómo el precio.
		System.out.println(Coche.dimePesoCoche());
		System.out.println(Coche.dimePrecioCoche());
		
		*/
		
		Coche coche1 = new Coche();
		
		coche1.estableceColor("verde");
		
		Furgoneta furgoneta1 = new Furgoneta(7, 580);
		
		furgoneta1.estableceColor("rojo"); // Puede acceder el objeto furgoneta1 a los métodos de la superclase Coche por la herencia y el extends
		
		furgoneta1.establecerClimatizador(true);
		
		System.out.println(coche1.dimeDatosGenerales() + coche1.dimeColor());
		System.out.println(furgoneta1.dimeDatosGenerales() + furgoneta1.dimeColor());
		
	}
	
}

/*
 SALIDA
 
 La plataforma del vehículo tiene 4 ruedas. Mide 2 metros con un ancho de 300cm y un peso de plataforma de 500 kg.El color del coche es verde.
 La plataforma del vehículo tiene 4 ruedas. Mide 2 metros con un ancho de 300cm y un peso de plataforma de 500 kg.El color del coche es rojo.
 
 
 */



