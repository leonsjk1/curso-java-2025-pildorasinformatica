package poo;

import java.util.*; // Se importa de la api de java, la clase Date de java.util



public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado[] misEmpleados=new Empleado[3];
		
		
//		String[] miarray = new String[3];
		
		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17); 
		/*
		 * Se almacena el primer empleado en la posición 1 del array.
		 * */
		
		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
		/*
		 * Se almacena el segundo elemento del array.
		 * */
		
		misEmpleados[2] = new Empleado("Maria Martín", 105000, 2002, 03, 15);
		/*
		 * Se almacena el tercer elemento del array empleado.
		 * */
		
		
//		for (int i = 0; i < 3; i++) {
//			
//			// Se agrega al método sube sueldo la cantidad a aumentar al array misEmpleados en cada posición.
//			misEmpleados[i].subeSueldo(5);
//		}
//		
//		for (int i = 0; i < 3; i++) {
//			
//			// Accede y acomoda los datos en su respectiva posición de cada valor del array de mis empleados.
//			System.out.println("Nombre: " + misEmpleados[i].dameNombre() 
//					+ " Sueldo: " + misEmpleados[i].dameSueldo() 
//					+ " Fecha de alta: " + misEmpleados[i].dameFechaContrato());
//		}
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5); // hace lo mismo para el método Empleado de subir sueldo.
		}
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() 
					+ " Sueldo: " + e.dameSueldo() 
					+ " Fecha de alta: " + e.dameFechaContrato());		
		}
		
		
//		Empleado empleado1=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
//		
//		Empleado empleado2=new Empleado("Ana López", 95000, 1995, 06, 02);
//		
//		Empleado empleado3=new Empleado("Maria Martín", 105000, 2002, 03, 15);
//		
//		empleado1.subeSueldo(5);
//		empleado2.subeSueldo(5);
//		empleado3.subeSueldo(5);
//		
//		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
//		+ " Fecha de Alta: " + empleado1.dameFechaContrato());
//		
//		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
//		+ " Fecha de Alta: " + empleado2.dameFechaContrato());
//		
//		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
//		+ " Fecha de Alta: " + empleado3.dameFechaContrato());
		
		/* Los campos de empleado muestran los datos de su contrato de cada empleado y a su sueldo se 
		 * les sube el 5% más con los métodos sube sueldo.
		 * 
		 * 
		 * También se hara otro código almacenando a los empleados con un array y se utilizará un bucle for
		 * para subir el sueldo a los empleados, y recorrer el array de empleados y mostrar los resultados en
		 * consola.
		 * 
		 * por eso se comenta el código de arriba.
		 * */
		
		
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
