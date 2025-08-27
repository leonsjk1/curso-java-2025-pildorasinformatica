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
		
	}

}
