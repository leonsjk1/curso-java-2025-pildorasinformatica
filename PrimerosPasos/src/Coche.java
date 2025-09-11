
public class Coche {
	
	public Coche() {
		
		ruedas=4; 
		//Defines el estado inicial del objeto Coche con sus caracteristicas que necesites asignarle.
		color = "gris";
		
		pesoBase=1350.25;
		
		precioBase=15650.25;
		
		peso=pesoBase;
		
		precio=precioBase;
	};
	
	private int ruedas;

	private double ancho;
	
	private double alto;
	 
	private double peso;
	
	private double pesoBase;
	
	private String color;
	
	private boolean climatizador;
	
	private boolean asientosCuero;
	
	private double precioBase;
	
	private double precio;
	
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto; 
		// Cuando se utiliza el this. la palabra reservada, es para diferenciar el 
		// campo de clase con el del parámetro en la función o método. Al igual que 
		// sirve para utilizarlo con métodos,  this.metodo1()  como ejemplo.
		
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso() {
		if (asientosCuero) pesoBase+=50; 
		// Si tiene asientos de cuero se le aumenta la cantidad a 
		// peso base declarado con 1350.25 se le agregan 50 kg.
		
		if (climatizador) pesoBase+=70;
		
		peso=pesoBase; 
		
		/* Si el coche no tiene ningun extra no va a entrar en las condiciones
		 * y por lo tanto sera el valor del peso base en el constructor.
		 * Si entra a alguna condicion, el peso aumentará el extra que se le haya dado
		 * en la condicion if.
		 * guardando el valor que se le incremento.
		 * 
		 * 
		 * */
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		color = c;
	}
	
//	public void setRuedas(int r){
//		/*
//		 * Se crea el "método de acceso" en modo publico, para que se acceda desde cualquier lugar.
//		 * el método no devuelve nada y el nombre del método o función y recibira un parametro que
//		 * recibirá el número de ruedas.		 * 
//		 * */
//		 
//		if(r<3 || r>4)  
//		/* 
//		 * Se utiliza la cóndicion para dar el número correcto de ruedas para un 
//		 * coche.
//		 * 
//		 *  */
//			System.out.println("El n° de ruedas no puede ser ese"); 
//		else 
//			ruedas=r;
//		
//	}
	
	public void setRuedas(int ruedas){
		 
		if(ruedas<3 || ruedas>4)  
			
			// El uso del this, se utiliza para dar referencia de cual es el valor 
			// del parametro de la función o método, y el valor del campo de la clase.
		
			System.out.println("El n° de ruedas no puede ser ese"); 
		else 
			this.ruedas=ruedas;
		
	}
	
	public int getRuedas(){
		
		/* Método de obtención de la información contenida en los métodos 
		 * de acceso para un campo encapsulado.
		 * 
		 * */
		
		return ruedas;
	}
	
	
	public double getPesoBase() {
		return pesoBase;
	}

	public void setPesoBase(double pesoBase) {
		this.pesoBase = pesoBase;
	}

	public String isClimatizador() {
		/* Esta instrucción devuelve el string si es true para cuando un coche 
		 * tiene el climatizador, pero como integra una condicion de tipo boolean
		 * si no tiene la condición completa devolviendo el tipo que se requiere,
		 * el método seguira dando error, hasta que no devuelva algun valor directo. 
		 * 
		 * */
		if (climatizador) return "El coche incorpora climatizador";
		
		else return "El coche incorpora aire acondicionado";
	}

	public void setClimatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")) this.climatizador=true;
		/*No se pueden comparar Strings con los signos de comparación 
		 * o igualdad == no sirven para valores que no son primitivos como el String.
		 * A un objeto tampoco sirve el comparador ==.
		 * 
		 * Habrá que utilizar el método de comparación Equals.
		 * 
		 * */
			
		else this.climatizador = false;
		
		setPrecio();
		
		setPeso();
	}

	public String isAsientosCuero() {
		if (asientosCuero) return "El coche incorpora tiene asientos de cuero";
		
		else return "El coche no tiene asientos de cuero";
	}

	public void setAsientosCuero(String asientosCuero) {
		
		if(asientosCuero.equalsIgnoreCase("si")) this.asientosCuero=true;
		/*No se pueden comparar Strings con los signos de comparación 
		 * o igualdad == no sirven para valores que no son primitivos como el String.
		 * A un objeto tampoco sirve el comparador ==.
		 * 
		 * Habrá que utilizar el método de comparación Equals.
		 * 
		 * */
			
		else this.asientosCuero= false;
		
		setPrecio();
		
		setPeso();
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPrecio() {
		return precio;
	}

	private void setPrecio() { 
		
		/*Si precio es un set que solo se va a utilizar dentro de su misma clase 
		 * y no se va a acceder a alguna otra para utilizar las operaciones que utiliza.
		 * 
		 * Entonces tambien lo podemos dejar como private method.
		 * 
		 * */
		
		if (climatizador) precioBase+=3250.20;
		
		if (asientosCuero) precioBase+=3500;
		
		precio=precioBase;
	}

	void arrancar() {
		
		
	}
	
	void frenar() {
		
		
	}
	
	void girar() {
		
		
	
	}
	
}
