import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); // Representa entrada por teclado.
		
		System.out.println("Introduce tu edad, porfavor");
		
		int edad = entrada.nextInt(); // guarda un objeto de tipo entero por consola.
		
		entrada.nextLine();
		
		System.out.println("Introduce tu nombre, porfavor");
		
		String nombre_usuario = entrada.nextLine(); // Básicamente hace la lectura de lo que se escribio en consola 
													//y lo guarda en una variable.
		
		System.out.println("Hola " + nombre_usuario + " Tienes " + edad + " años"); //el programa entra en modo de ejecución.
		
		entrada.close(); // Una vez que terminas de usar la via de comunicación, es recomendable cerrar para no consumir recursos.
		
		
	}

}
