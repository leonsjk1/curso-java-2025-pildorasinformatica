
public class Coche {

	double ancho;
	
	double alto;
	 
	double peso;
	
	String color;
	
	private int ruedas;
	
	public void setRuedas(int r){
		/*
		 * Se crea el "método de acceso" en modo publico, para que se acceda desde cualquier lugar.
		 * el método no devuelve nada y el nombre del método o función y recibira un parametro que
		 * recibirá el número de ruedas.		 * 
		 * */
		 
		if(r<3 || r>4) { 
		/* 
		 * Se utiliza la cóndicion para dar el número correcto de ruedas para un 
		 * coche.
		 * 
		 *  */
			System.out.println("El n° de ruedas no puede ser ese");

		} else {
			
			ruedas=r;
		}
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
