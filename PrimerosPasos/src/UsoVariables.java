
public class UsoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*byte edad;*/
		
		
		/*
		 * var edad;
		 * 
		 * edad = 17; inferencia de tipos no permite inicializar variables después de la declaración,
		 */
		
		
		
		/* edad = 17;*/   
		
		/*
		 * var edad = 17;
	
			edad = 35;
		
			System.out.println(edad);
		 */ 
		/*
		 * 
			int edad=0;
		/*
		 * Aca int = edad; no puede quedarse sin inicializar por que dara error el compilador por no
		 * saber que valor tiene la variable declarada.
		 * 
		 * 
		 
		
			double mediaEdad = edad/5;
		 */	
		
		
		
		/*
		 * 
		 * String nombre = "";
		
			nombre = "Juan";
		 * No es valido en java comparar con el objeto String, ya que como bien se menciona es un objeto.
			String nombre = “Juan”;
			String nombre2 = “Ana”;

			if (nombre == nombre2) no esta bien hacerlo de esta forma.
		 */

//		int edad = 15 ;
//		
//		edad += 10; // asigna el valor de 10 unidades a edad que ya contenia el valor 15 + 10 = 25;
//		
//		edad--; // decrementa el valor en 1 ya no valdria 15 ahora valdria 14;
		
		//int edad = 15;
		
		
		/*
		 * 
		 *  
		 *  
			edad+=10;
		
			edad = edad+10;
		 *  
		 *  Este ejemplo es lo mismo ya que es equivalencia solo que se ahorra código.
		 *  
		 *  
		 */
		
//		
//		int edad = 15;
//		
//		edad += 10;
//		edad = edad+10;
//		
//		System.out.println(edad); // 35 años.
//	
//	
//		double num1 = 7;
//		double num2 = 3;
//		
//		System.out.println(num1%num2); //residuo o modulo de los números.
//		
		
//		int num11 = 5;
//		double num22 = 2;
//		
//		double resultado=num11/num22;
//		
//		System.out.println(resultado); // como es un error de tipo 
//		//entero a double, el resultado no se va a reflejar del tipo que esta guardando el 
//		//resultado y por lo tanto no da los valores correctos;
//		
//		
//		int edad = 19;
//		
//		String nombre = "Juan tiene ";
//	
//		System.out.println(nombre + edad + " años");
//		
//		// esto de arriba concatena numeros con textos, los une.
		
		
		
//		int operador1, operador2, resultado; //Puedes declarar multiples variables.
//		
//		operador1=7; //puedes asignar e inicializar el valor de esta forma.
//		operador2=9;
//		
//		resultado = operador1+operador2; // puedes asignar e inicializar la variable al mismo tiempo.
//		
//		System.out.println(resultado); 	// puedes utilizar la variable que no se le asigno valor común para 
//									 	// utilizarla y quitar advertencias de las variables asignadas adelante
//										// de la declaración.
//
//		int operador11=7 , operador22=9, resultado22=operador11+operador22; // Se puede asignar y declarar al mismo y 
//																			// evaluar en la misma linea.
//		
//		
//		
//		System.out.println(resultado22);
		
		byte numero1=15;
		byte numero2=25;
		
		// byte resultado = (byte)(numero1+numero2); //casting 
		
		//System.out.println(resultado);
		
		/*
			Se promociona el valor que se almacena en bytes
			ya que el compilador quiere evitar que se desborde la pila de compilación.
			unicamente por operar con valores de tipo byte, shorts.
			
			Se tiene que hacer una conversión explicita llamada "CASTING" para que convierta un tipo en otro.
			
		*/
		
		System.out.println(((Object)(numero1+numero2)).getClass().getSimpleName()); //ejemplo de promoción de tipos.
		
		
		 
		
		
	}

}
