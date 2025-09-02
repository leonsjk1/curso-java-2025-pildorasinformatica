import javax.swing.JOptionPane;

public class UsoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] miArray = new int[5]; // Crea el array de 5 elementos.
//		
//		miArray[0]=5;
//		miArray[1]=15;
//		miArray[2]=51;
//		miArray[3]=53;
//		miArray[4]=95;
//		
//		System.out.println(miArray[0]);
//		System.out.println(miArray[1]);
//		System.out.println(miArray[2]);
//		System.out.println(miArray[3]);
//		System.out.println(miArray[4]);
		
//		int[] miArray= new int[5];
//		miArray[0]=5;
//		miArray[1]=15;
//		miArray[2]=51;
//		miArray[3]=53;
//		miArray[4]=95;
		
		int[] miArray= { 5, 15, 52, 53, 95, 76, 54, 98, 34, 54, 23, 56, 67 }; 
		// Es otra manera de declarar los arrays.
		
		for (int i = 0; i < miArray.length; i++) {
			
			System.out.println("los valores de indice " + i + " igual a " + miArray[i]); 
			// imprime el contador y los valores que se encuentran en la longitud del arreglo,
			// en la posición del contador.
			
		}

	}

}
