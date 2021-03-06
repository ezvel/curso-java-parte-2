public class Coche {
	
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
Curso Java. Herencia 1. Video 40
https://www.youtube.com/watch?v=wqoyQ3BxK4A&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=40
Curso Java. Herencia 2. Video 41
https://www.youtube.com/watch?v=rEOFpdI3HY0&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=41

*/

