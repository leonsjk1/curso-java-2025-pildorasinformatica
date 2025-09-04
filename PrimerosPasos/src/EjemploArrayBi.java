
public class EjemploArrayBi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double acumulado; // Almacenado del capital año con año.
		double interes = 0.10;
		
		double[][] saldo = new double[6][5];
		
		
		for (int i = 0; i < 6; i++) { 
			// For que recorre el primer elemento del array bidimensional con 6 indices en las columnas;
			
			saldo[i][0]= 10000; 
			
			/*Recorre el primer incide de la fila hata la ultima columna, llenadolo de valores
			como se encuentra en el documento realizado */
			
			acumulado = 10000;
			
			for (int j = 1; j < 5; j++) {
				/*Se empieza desde la posición 1 ya que el indice 0 se relleno con el valor general incial de la tabla
				 * del documento, que son los 10,000 que se almacenaron del primer año ahorrado.
				 * 
				 */
				
				acumulado=acumulado+(acumulado*interes); 
				/* 10,000 + (10,000 x 0.10) */
				saldo[i][j] = acumulado; 
				// Se almanena por cada vuelta lo que tiene el valor de acumulado.
			}
			
			/*A la siguiente vuelta del for, la siguiente columna tiene que aumentar el interes que se necesita
			 * para que incremente los valores;
			 * */
			interes=interes+0.01;
		}
		
		for (int z = 0; z < 6; z++) {
			
			System.out.println();
			for (int h = 0; h < 5; h++) {
				System.out.printf("%1.2f", saldo[z][h]); 
				// Se le da el formato para imprimir los valores en consola con valor decimal.
				
				System.out.print(" ");
			}
		}
	}

}
