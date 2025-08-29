import java.util.Scanner;

public class JuegoAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Math.random()); //genera numeros aleatorios entre el 0.0 y el 1.0 con decimal.
		
		// Video 18 while
//		int aleatorio = (int)(Math.random()*100)+1;
//		
//		Scanner entrada = new Scanner(System.in);
//		
////		System.out.println(aleatorio);
//		
//		int intentos = 0;
//		
//		int numeroUsuario= 0;
//		
//		while(aleatorio!=numeroUsuario) {
//			intentos++;
//			
//			System.out.println("Introduce un número entre 1 y 100");
//			
//			numeroUsuario=entrada.nextInt();
//			
//			if (aleatorio>numeroUsuario) System.out.println("Más alto");
//			
//			else if (aleatorio<numeroUsuario) System.out.println("Más bajo");
//			
//			
//		}
//		System.out.println("Correcto lo has adivinado en " + intentos + " intentos");
		
		
		int aleatorio = (int)(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int intentos = 0;
		
		int numeroUsuario = 0;
		
		do {
			
				intentos++;
				
				System.out.println("Introduce un número entre 0 y 99");
				
				numeroUsuario = entrada.nextInt();
				
				if(aleatorio>numeroUsuario)System.out.println("Más alto");
				
				else if(aleatorio<numeroUsuario)System.out.println("Más bajo");;
			
		}while(aleatorio!=numeroUsuario);
		
		System.out.println("Correcto. Lo has adivinado en " + intentos + " intentos");
		
	}
	
	

}
