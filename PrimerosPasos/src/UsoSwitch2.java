import java.util.Scanner;

public class UsoSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce dia de la semana");
		
		String dia_semana = entrada.nextLine();
		
		String resultado = switch(dia_semana){ 
		// Segunda forma del switch a partir del java 14 se modifico la utilización del switch.
		
		/* Se guarda el valor ahora en la variable que recibe del switch */
			case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" -> "Laborable";
			
			case "Sabado", "Domingo" -> "Festivo";
//			case "Martes"-> "Laborable";
//			
//			case "Miercoles"-> "Laborable";
//			
//			case "Jueves"-> "Laborable";
//			
//			case "Viernes"-> "Laborable";
//			
//			case "Sabado" -> "Festivo";
//			
//			case "Domingo" -> "Festivo";
//			
			default->{
				System.out.println("Procesando...");
				yield "Día no valido";
				// la novedad es que puedes mandar varias lineas de código en el switch
				// colocando la instrucción yield;
			}
		};
		
		System.out.println(resultado);
		
	}

}
