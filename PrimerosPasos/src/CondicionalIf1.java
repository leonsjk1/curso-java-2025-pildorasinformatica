import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class CondicionalIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad porfavor ");
		
		int edad = entrada.nextInt();
		
//		if (edad >= 18) {
//			System.out.println("Eres Mayor de Edad");
//		} else {
//			System.out.println("Eres Menor de Edad");
//		}
		
//		if(edad>=18)System.out.println("Eres Mayor de Edad");
//		
//		else System.out.println("Eres Menor De Edad");
		
		
		/*if(edad<=18)System.out.println("Eres Muy joven");
		
		if(edad<=35) System.out.println("Eres Joven"); 
		// A partir de esta opción se ejecutan todas las validaciones por el flujo de ejecución.
		
		if(edad<=60) System.out.println("Eres Maduro");
		
		if(edad<=90) System.out.println("Cuidate");*/
		
		
		if(edad<=18) System.out.println("Eres muy joven"); 
		
		else if(edad<=35) System.out.println("Eres Joven");
		
		else if(edad<=60) System.out.println("Eres Maduro");
		
		else if(edad<=90) System.out.println("Cuidate");
		
		else System.out.println("Dónde vas con esa edad !!!");
		
		
		
		
//		entrada.close();
//		
//		
//		try {  // Bloque try-catch para el manejo de errores por si los archivos que mandamos como método de entrada
//				// no exsiten en el código.
//			
//			System.setIn(new FileInputStream("datos.txt"));//Aqui empieza las nuevas lineas de entrada para código donde aca 
//															//ya puedo utilizar el nuevo scanner con otro método de entrada.
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Scanner entrada2 = new Scanner(System.in);
//		// Tendremos error de ejecución ya que esta cerrado el flujo de escaner con System.in, 
//		// Sin la integración del nuevo método de entrada, ejemlpo el archivo de lectura arriba de este código.
//		
//		
		/*
		 * Como tenemos varias lineas de código, con muchos condicionales if, no podemos hacer los operadores ternarios.
		 * ya que son varias lineas de código con el mismo if.
		 * 
		 * */
		
		
		
		
	}

}
