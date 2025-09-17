package poo;

public class Furgoneta extends Coche {
	
	/* Esta clase de coche se convierte en superclase 
	 * de la subclase Furgoneta
	 * 
	 * 
	 * */
	
	private int capacidad_carga;
	// Cuanto almacena el peso de la camioneta.
	
	private int plazas_extra; 
	// Número de personas que pueden viajar en la camioneta.
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		
		super(); 
		/*
		 * llama al constructor de la clase padre, para darle un estado incial al objeto.
		 * 
		 * */
		this.capacidad_carga = capacidad_carga;
		
		this.plazas_extra = plazas_extra;
		
	}
	
}
