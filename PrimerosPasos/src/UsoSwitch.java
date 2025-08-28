import java.util.Scanner;

public class UsoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Introduce el n° mes, porfavor");
//		
//		int numero_mes = entrada.nextInt();
//		
//		switch(numero_mes) { 
//		// ingresas el valor del case que quieres utilizar y dependiendo de la condición.
//			case 1:
//				System.out.println("Enero");
//				break;
//			case 2:
//				System.out.println("Febrero");
//				break;
//			case 3:
//				System.out.println("Marzo");
//				break;
//			case 4:
//				System.out.println("Abril");
//				break;
//			case 5:
//				System.out.println("Mayo");
//				break;
//			case 6:
//				System.out.println("Junio");
//				break;
//			case 7:
//				System.out.println("Julio");
//				break;
//			case 8:
//				System.out.println("Agosto");
//				break;
//			case 9:
//				System.out.println("Septiembre");
//				break;
//			case 10:
//				System.out.println("Octubre");
//				break;
//			case 11:
//				System.out.println("Noviembre");
//				break;
//			case 12:
//				System.out.println("Diciembre");
//				break;
//				
//			default:
//				System.out.println("N° de mes incorrecto");
			// existe el caso default como si fuera un else de la estructura IF.
				
				
			/*	nota nueva del video 18: el break si no se incluye en un case, puede
				que se utilice para agrupar varios case que hagan lo mismo, porque si
				la instrucción del break no se agrega en el código, te va a mostrar la
				consola o la salida de impresión, varios case por no agregarlo en cada 
				caso.	
			*/
		
				int dia = 7;
			
				switch(dia) { 
				// ingresas el valor del case que quieres utilizar y dependiendo de la condición.
					case 1:
						System.out.println("Lunes");
						break;
					case 2:
						System.out.println("Martes");
						break;
					case 3:
						System.out.println("Miércoles");
						break;
					case 4:
						System.out.println("Jueves");
						break;
					case 5:
						System.out.println("Viernes");
						break;
					case 6: 
						/* No da error porque esto es correcto, pero como no hay nada
						 * ni la intrucción break, pasa a la siguiente linea y lee el siguiente
						 * valor más proximo, que es fin de semana y termina porque acá si
						 * incluye el break.
						 * 
						 * */
					case 7:
						System.out.println("Fin de semana");
						break;
						
					default:
						System.out.println("Otro día");
						
					// Si debes de utilizar la instrucción yield con la forma de operador
					// flecha en el switch. Para que no salga de algunos metodos con la palabra return.
		}
	}

}
