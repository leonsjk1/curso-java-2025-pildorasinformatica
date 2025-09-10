
public class PasoValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clase1 obj = new Clase1();
		
		int num = 5; 
		/*Se crea el valor a pasar en el método*/
		
		
		obj.duplicar(num); 
		/* Se pasa la referencia por valor */
		
		
		System.out.println("Valor de num= " + num); 
		/* Se valida el valor original que contiene número y 
		 * solo se modifica el valor "x" obteniendo el resultado 
		 * del paso de valor. */
		
	}

}


/*Comentario General: Java no hace paso por referencia para 
 * evitar temas más complejos en el cambio de valores, no se crea 
 * un vinculo para evitar los cambios.
 * */


class Clase1 {
	
	void duplicar(int x) {
		
		x=x*2; // Se hace la operación correcta.
		
		System.out.println("El valor de x= " + x); 
		// El valor de x es igual a 10 
		// pasando el valor de num.
		
	}
}
