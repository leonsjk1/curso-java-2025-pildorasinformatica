import javax.swing.JOptionPane;

public class UsoArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] paises = {"Albania", "Camerun", "Inglaterra", "Africa", "Estonia", "México",
//		                   "Uganda", "China"};
		
//		String[] paises = new String[9];
		
//		paises[0] = "España";
//		paises[1] = "México";
//		paises[2] = "Colombia";
//		paises[3] = "Perú";
//		paises[4] = "Chile";
//		paises[5] = "Argentina";
//		paises[6] = "Ecuador";
//		paises[7] = "Venezuela";
//		paises[8] = "EEUU";
		
//		String[] paises = {"Albania", "Camerun", "Inglaterra", "Africa", "Estonia", 
//							"México", "Ecuador", "Argentina"};
//		
//		
//		for (String elemento : paises) System.out.println("Pais: " + elemento); 
		// no contiene indice y actualiza de manera rápida, la salida de nuevos elementos agregados
		// en el array, recorriendo el primer elemento hasta el ultimo.
		
		
		
		
		//Ejercició1: Pedir desde la ventana de JOption pane los datos de paises, hasta que se llene el
		//arreglo e imprimirlo.
		
//		String[] paises2 = new String [8];
//		
//				
//		for (int i = 0; i < 8 ; i++) {
//		
//			paises2[i] = JOptionPane.showInputDialog("Introduce los paises");
//		};
//			
//		
//		for (String elementos : paises2) System.out.println("los elementos son " +  elementos);
//		
		
		
		
		
		//Ejercicio 2: Almacenar 200 numéros aleatorios en un array y con un bucle foreach mostrar
		//los elementos en consola.
		
		int[] aleatorios = new int[200];
		
		for (int i = 0; i < aleatorios.length; i++) {
			
			aleatorios[i] = (int)(Math.random()*100);
//			System.out.println("el contador es " + i + " valores " + aleatorios[i]);
		}
		
		for (int elementos : aleatorios) System.out.print(elementos + " ");
		
		
	}

}
