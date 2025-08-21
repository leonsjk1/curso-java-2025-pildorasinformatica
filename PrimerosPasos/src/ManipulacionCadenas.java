
public class ManipulacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String nombre = "Juan";
		
		//String nombre2 = new String("Juan"); también es valido crear y asignarlo de esta forma.
		
		
		// String.length(); // esto es un error.
		
		
		//  nombre.length(); // esta es la forma correcta para mandar el valor del objeto string;
		// y se puede guardar el valor en un entero que es lo que regresa el metodo length().
		
		/*
		 * int longitud = nombre.length();
		 * 
		 * 
		 * System.out.println(longitud);
		 * 
		 * 
		 */ 
		
		// lo puedes almacenar en una variable o puedes ahorrar código y
									 // y puedes mandarlo directo a imprimirlo depende de 
									// la circunstancia del projecto.
		
		
		// Ejemplo System.out.println(nombre.length()); forma directa.
		
		
		// System.out.println("Mi nombre tiene " + nombre.length() + " letras" ); 
		
		// concatenamos con el operador + de suma o más para valores con valores, cadenas con cadenas
		//, cadenas con valores; 
		
		
		
		

//-------------------------------------------------------------------------------------------------------
		
		
		// Metodo CHARat
		// Devuelve el caracter o el valor que hay en un indice o posición.
		// No es static, devuelve un char de tipo caracter y los char van en comilla simple.
		// Las cadenas devuelven comillas dobles.
		
		
		//		System.out.println("la ultima letra de mi nombre es " + 
		//		nombre.charAt(3)); // no es la ultima letra porque esta en la posicion 3.
		
		/*
		 * String nombre = "Armando.-er";
		 * 
		 * 
		 * System.out.println("la ultima letra de mi nombre es " +
		 * nombre.charAt(nombre.length()-1));
		 */
		
		// Se puede ingresar algo como un método, o 
		//las cifras del tipo que pida el método, función mientras que sea del tipo y te lo permita mandar
		//, esta super.
		
		
		
		
		String frase= "Hoy es un estupendo día para aprender a programar en Java";
		
//		String subcadena = frase.substring(4, 6);
			
		// System.out.println("Hoy " + subcadena + " viernes"); // imprime el primer valor de la posición que tu
		/*
		 * le mandes y el segundo parametro la siguiente posición de la cadena o el string que estes utilizando
		 * dependiendo de la sobrecarga del método que estes utilizando de substring.
		 * .
		 */
		
		// String subcadena = frase.substring(4); // manda a partir del valor que quieres en adelante de las cadenas o 
		// String que estes utilizando.
		
		
		//System.out.println(subcadena);
		
		
// --------------------------------------------------------------------------------
// --------------------------------------------------------------------------------
// --------------------------------------------------------------------------------
// --------------------------------------------------------------------------------
// --------------------------------------------------------------------------------
// --------------------------------------------------------------------------------

		
		/*
		 *	 Método EQUALS sirve para comparar objetos.
		 *	
		 *	para cadenas de caracteres case sensitive.
		 * 
		 */
		
		String alumno1="David";
		
		String alumno2="David";
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		//System.out.println(alumno1.equals(alumno2));
		/*
		 * equals compara dos cadenas iguales pero es case sensitive, 
		 * si cambia una letra a minuscula o mayuscula y es el mismo nombre, 
		 * el valor del método boolean, mandará false, porque la letra 
		 * cambio de minuscula a mayuscula o viceversa.
		 * 
		 */
		
		
		/*
		 * Metodo equalsIgnoreCase ignora el modo sensitivo de caracteres para no 
		 * tener que cuidar los valores en mayuscula o minuscula.
		 * 
		 * alumno1.equalsIgnoreCase(alumno2);
		 */
		
		
//		if ( alumno1.equals(alumno2) ) {
//			
//			System.out.println(frase.substring(12));
//		
//		} else {
//			
//			System.out.println("no se pudo");
//		}
//		
		
		
	}

}
