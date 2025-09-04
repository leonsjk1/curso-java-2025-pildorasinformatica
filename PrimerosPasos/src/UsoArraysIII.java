
public class UsoArraysIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] bidimensional = new int[5][3];
		
		bidimensional[0][0] = 5;
		bidimensional[0][1] = 2;
		bidimensional[0][2] = 67;
		
		bidimensional[1][0] = 34;
		bidimensional[1][1] = 85;
		bidimensional[1][2] = 65;
		
		bidimensional[2][0] = 85;
		bidimensional[2][1] = 87; // Se almacenan los datos en cada posición.
		bidimensional[2][2] = 85;
		
		bidimensional[3][0] = 87;
		bidimensional[3][1] = 65;
		bidimensional[3][2] = 87;
		
		bidimensional[4][0] = 65;	
		bidimensional[4][1] = 85;
		bidimensional[4][2] = 65;
		
		// Si quiero imprimir en consola, tengo que dar la referencia del valor que quiero
		// mostrar ejemplo: bidimensional[4][0] = 65;
		
		
		for (int i = 0; i < 5; i++) { //un for para las columnas.
			for (int j = 0; j < 3; j++) { //un for para recorrer las filas. 
				// se anidan los for para poder recorrer un array bidimensional
				
				System.out.print( bidimensional[i][j]+" " );
				// además solo entra en el primer for, y se incrementa el valor del for de j hasta
				// recorrer los elementos de las filas.
			}
			System.out.println();
		}

		
		
		// VIDEO 26 actualización para el array bidimensional.
		
		/*Forma diferente de declarar un array de 2 dimensiones*/
		
		
		int [][] matrix = {
				{10, 15, 18, 19, 21},
				{223, 2, 65, 62, 74},
				{43, 17, 98, 22, 35},
		};
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print( " " + matrix[i][j]);
//			
//			}
//			
//			System.out.println();
//			
//		}
		
		for (int[] fila : matrix) { 
			/* Este for lo que hace es recolectar la información de los arrays que se encuentran
			 * en matrix que es el arreglo bidimensional en la posición de los arrays.
			 * y guardar los valores en fila.
			 * */
			
			System.out.println();
			
			for (int z : fila) {
				/*
				 * For que va a recorrer cada uno de los elementos de los 
				 * arrays que se encuentran en la primera dimension.
				 * 
				 * los elementos que encuentra son solo de tipo entero.
				 * */
				
				System.out.print(" " + z + " ");
			}
			System.out.println();
		}

	}

}
