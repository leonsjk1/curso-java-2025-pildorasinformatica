
public class Coche {
	
	public Coche() {
		
		ruedas=4; 
		//Defines el estado inicial del objeto Coche con sus caracteristicas que necesites asignarle.
		color = "gris";
	};
	
	private int ruedas;

	private double ancho;
	
	private double alto;
	 
	private double peso;
	
	private String color;
	
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

	public void setPeso(double peso) {
		this.peso = peso;
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
	
	void arrancar() {
		
		
	}
	
	void frenar() {
		
		
	}
	
	void girar() {
		
		
	
	}
	
}
