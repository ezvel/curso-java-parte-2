/*
 * Clase 30 - Herencia
 * 
 * Utilizamos el proyecto coches pero en un mismo archivo
 * 
 * 
 * 
 * 
 * 
 * 
 * */


import javax.swing.*; //Se utilizará JOptionPane

public class Coches {

	public static void main(String args[]) {
		
		Coche Coche1 = new Coche(); // <- instanciar la clase
		
		//System.out.println(Coche1.ruedas); <- no puedo obtener una propiedad encapsulada
		System.out.println(Coche1.dimeDatosGenerales()); // <- obtengo propiedad encapsulada porque se me dio el permiso
		
		//Coche1.estableceColor("azul"); // si comentamos esta linea nos devuelve null porque la variable colo está vacia y el método setter si se comenta no convocaráa al método
		Coche1.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		
		//Coche1.color = "verde"; //Estoy modificando el color. Es azul o verde <- nunca podemos modificar la propiedad de un objeto desde su instancia <- no se puede violar el concepto de encapsulación <- tenemos que encapsular las prpiedades cómo color para que sea manipulada dentro de setters
		
		//Los métodos getters y setters son cómo los cables de conexión que permite obtener o modificar propiedades. En la linea anterior estabamos modificando estas propiedades sin pasar por los canales correspondientes. Por ese motivo se es necesario el concepto de encapsulamiento
		
		//Coche1.establecerAsientos(4);
		Coche1.establecerAsientos(Integer.parseInt(JOptionPane.showInputDialog("Cantidad de asientos")));
		Coche1.establecerClimatizador(true);
		
		System.out.println(Coche1.dimeColor());
		System.out.println(Coche1.dimeAsientos());
		System.out.println(Coche1.dimeClimatizador());
		//No fue necesario llamar a un setter porque las dos lineas de abajo se construyó un getter y setter a la vez para establecer y obtener tanto el peso cómo el precio.
		System.out.println(Coche1.dimePesoCoche());
		System.out.println(Coche1.dimePrecioCoche());
	}
}



class Coche {
	
	//Características comunes <- encapsulamos con private aquellas propiedades que no queremos que se accedan o modifiquen
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private int pesoTotal;
	//Características que pueden variar en cada objeto
	private String color;
	private int asientos;
	private boolean climatizador;
	
	public Coche() {
		
		//Con el constructor estado inicial de nuestra clase o los objetos que se creen a partir de él
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
		
	}
	
	//método getter para dar permiso al objeto a obtener el valor de una propiedad, pero sin modificarla
	public String dimeDatosGenerales() {
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas." + 
		" Mide " + largo/1000 + " metros con un ancho de " +
		ancho + "cm y un peso de plataforma de " + pesoPlataforma + " kg.";
		
	}
	//Le estoy dando el permiso desde la clase para que se obtenga la propiedad
	
	//método setter para dar permiso a poder modificarse desde un objeto
	
	//SETTERS color - asientos - climatizador
	
	//color - setters
	public void estableceColor(String color) { //<- parámetros para pasarle un valor
		
		this.color = color;
		
	}
	
	//asientos - setters
	public void establecerAsientos(int asientos) {
		
		this.asientos = asientos;
		
	}
	
	//climatizador - setters
	public void establecerClimatizador(boolean climatizador) {
		
		if(climatizador == true) {
			
			this.climatizador = true;
			
		} else if (climatizador == false) {
			
			this.climatizador = false;
			
		}
		
	}
	
	//GETTER color - asientos - climatizador
	
	//color - getters
	public String dimeColor() {
		
		return "El color del coche es " + color + ".";
		
	}
	
	//asientos - getters
	public String dimeAsientos() {
		
		return "El coche tiene " + asientos + " asientos.";
		
	}
	
	//climatizador - getters
	public String dimeClimatizador() {
		
		if(climatizador == true) {
			
			return "El coche tiene climatizador";
			
		}else {
			return "El choche no tiene climatizador";
		}
		
	}
	
	//Setter y getter  <- Practica no recomendada, mejor tener los getters y setters por separado
	
	//Peso del coche
	public String dimePesoCoche() {
		
		int pesoCarroceria = 500;
		
		pesoTotal = pesoPlataforma + pesoCarroceria;
		
		if (asientos == 4) {
			
			pesoTotal = pesoTotal + 50;
			
		}
		
		
		if(climatizador = true) {
			
			pesoTotal = pesoTotal + 10; //Establece valor variable
		}
		
		return "El peso del coche es " + pesoTotal + "Kg."; //Devuelve o obtiene el peso total
		
		
	}
	
	//Precio del coche según el peso
	public String dimePrecioCoche() {
		
		int precioFinal = 10000;
		
		if(asientos == 4) {
			
			precioFinal+=2000;
			
		}
		
		if(climatizador == true) {
			
			precioFinal+=1500;
			
		}
		
		return "El precio final es " + precioFinal;
		
	}
	
	
}



/*
Fuentes:


*/

