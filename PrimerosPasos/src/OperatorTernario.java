import java.util.Scanner;

public class OperatorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad porfavor ");
		
		int edad = entrada.nextInt();
		
		/*
		 * if(edad<18) System.out.println("Eres menor de edad");
		 * 
		 * else System.out.println("Eres Mayor de edad");
		 */
		
		
		
		//Este es el operador ternario condicion ? valor si verdad: valor si no es verdad.
		
		String resultado = (edad<18)? "Eres menor de edad":"Eres mayor de edad";
		
		System.out.println(resultado);
		
		
		

	}

}
