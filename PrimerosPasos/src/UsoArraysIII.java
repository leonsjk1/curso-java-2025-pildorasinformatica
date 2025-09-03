
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


	}

}
