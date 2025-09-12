package poo;

import java.util.*; // Se importa de la api de java, la clase Date de java.util



public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Las clases se generan en otra carpeta dependiendo del paquete
		 * para mejor organización.
		 * 
		 * 
		 * Puedes crear una aplicación en donde los archivos java esten separados.
		 * 
		 * También puedes crear un archivo java en donde se tienen 2 o más clases.
		 * 
		 * 
		 * Para efectos de practicidad es mas comodo porque generas menos archivos.
		 *  
		 * solo para aplicaciones pequeñas.
		 * 
		 * Mala práctica para proyectos medianos o grandes.
		 * 
		 * Solo cuando se meten clases en un mismo archivo, solo la que contiene el método main
		 * puede ser clase public, cuando hay clases separadas, pueden haber más clases públic.
		 * 
		 * 
		 * */
		
		
		
	}

}

class Empleado {
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		/* Se crea el estado incial de este empleado va a tener todos los parametros declarados,
		 * en el constructor de la clase Empleado.
		 * 
		 * 
		 * */
		
		nombre=nom;
		
		sueldo=sue;
		
		/* Se utilizará el método de calendario de la clase GregorianCalendar para utilizarlo en los 
		 * parametros que recibiran para la alta del contratación del empleado, ya que tiene 
		 * un buen manejo de fechas de la internacionalización de calendario que se 
		 * tiene actualmente en el mundo.
		 * */
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		/* Al mes le resta menos 1 para que coincidan con los valores del 
		 * indice del mes 0 - 11 para coincidir con los meses que queremos pedir sin 
		 * equivocarnos en los indices */
		
		altaContrato=calendario.getTime();
		
		// Obtiene el la fecha del objeto calendario.
		// El método getTime hereda de las clases de gregorian 
		// calendar por que viene de la 
		
	}
	
	public String dameNombre() { // get prefijo inicial en el nombre del método, 
								 //para decir que es un getter o un setter set y el nombre.
		return nombre; 
	}
	
	
	public double dameSueldo() { // getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { // getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { 
		// Método de lógica de negocio o dominio.
		// Aplica una regla de negocio porque sube 
		// el sueldo de un porcentaje especificado.
		
		double aumento=sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
	
}
