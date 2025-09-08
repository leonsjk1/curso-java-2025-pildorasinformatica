
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
	
	public void setRuedas(int r){
		/*
		 * Se crea el "método de acceso" en modo publico, para que se acceda desde cualquier lugar.
		 * el método no devuelve nada y el nombre del método o función y recibira un parametro que
		 * recibirá el número de ruedas.		 * 
		 * */
		 
		if(r<3 || r>4)  
		/* 
		 * Se utiliza la cóndicion para dar el número correcto de ruedas para un 
		 * coche.
		 * 
		 *  */
			System.out.println("El n° de ruedas no puede ser ese"); 
		else 
			ruedas=r;
		
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
