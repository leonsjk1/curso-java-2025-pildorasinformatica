package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Paco");
		
		Empleados trabajador2 = new Empleados("Ana");
		
		Empleados trabajador3 = new Empleados("Antonio");
		
		Empleados trabajador4 = new Empleados("María");
		
		Empleados trabajador5 = new Empleados("María2");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" 
		+ trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos() + 
		"\n" + trabajador4.devuelveDatos() + "\n" + trabajador5.devuelveDatos());
		
		
		System.out.println(Empleados.dameIDSiguiente());
		
		
//		Empleados.Id++;  
		/* 
		 * El problema de esto es que la variable la estamos dejando en public saltando
		 * el encapsulamiento y la segunda problematica es que tu estas haciendo un conteo
		 * manual del id para objeto empleado que se crea en la clase main 
		 * para eso se utiliza otra solución para los tipos static 
		 * 
		 * */
		
//		System.out.println(trabajador2.devuelveDatos());
		
//		Empleados.Id++; // Forma Incorrecta.
		
//		System.out.println(trabajador3.devuelveDatos());
		
//		System.out.println(trabajador4.devuelveDatos());
		
//		System.out.println(trabajador5.devuelveDatos());
	}

}

class Empleados {
	
	
	public Empleados ( String nom ) {
		
		nombre = nom;
		
		seccion = "Administración";
		
		Id=IdSiguiente; 
		// Se guarda el valor de idsiguiente en Id compartiendo los valores de idSiguiente.
		
		IdSiguiente++;
		// Se incrementa Id Siguiente para cuando se crea el nuevo 
		// objeto y tenga el siguiente valor del id.
		
	}
	
	public void cambiaSeccion(String seccion) { //Setter
		
		this.seccion=seccion;
		
	}
	
	public String devuelveDatos() {
		
		return "El nombre: " + nombre + " y la sección es " + seccion + " y el Id= " + Id;
		
	}
	
	
	/* Queremos saber cual es el id siguiente del trabajador para esto, 
	 * el método estatico trabaja sobre la clase como metodo, 
	 * no actua sobre los objetos, se utiliza la misma nomenclatura que las
	 * variables y constantes estaticas, Ejem: Empleados.dameIdSiguiente().
	 * */
	public static String dameIDSiguiente() { 
		
		return "El id Siguiente es : " + IdSiguiente ;
	}
	
	private final String nombre;
	// Este valor lo has convertido en una constante por lo 
	// cual dara error si lo quieres utilizar en algun método 
	// una vez que ya lo asignaste.
	
	private String seccion;
	
	private int Id; 
	// Igualar el valor de la variable statica para realizar la encapsulación del valor.
	
	private static int IdSiguiente=1; 
	// Variable que solo van a compartir el ID para empleado.
	
}
