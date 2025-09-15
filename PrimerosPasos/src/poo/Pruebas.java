package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Paco");
		
		Empleados trabajador2 = new Empleados("Ana");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador2.devuelveDatos());
		
	}

}

class Empleados {
	
	
	public Empleados ( String nom ) {
		
		nombre = nom;
		
		seccion = "Administración";
		
	}
	
	public void cambiaSeccion(String seccion) { //Setter
		
		this.seccion=seccion;
		
	}
	
	public String devuelveDatos() {
		
		return "El nombre: " + nombre + " y la sección es " + seccion;
		
	}
	
	private final String nombre; 
	// Este valor lo has convertido en una constante por lo 
	// cual dara error si lo quieres utilizar en algun método 
	// una vez que ya lo asignaste.
	
	private String seccion;	
}
