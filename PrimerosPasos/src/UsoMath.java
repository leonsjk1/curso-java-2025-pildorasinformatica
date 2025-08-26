//import java.math.BigInteger; // importación de clases que no sean las más importantes como java.lang


public class UsoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		double raiz = Math.sqrt(10); //(int)Math.sqrt(9); // casting de double a int pero precaución porque puede haber 
//		
//		// perdida de información entre los tipos de datos.
//		
//		System.out.println(raiz);
		
//		int potencia=(int)Math.pow(25, 560); // hacer la potencia de un tipo double.
//		
//		System.out.println(potencia);
		
		/*
		 * BigInteger base = BigInteger.valueOf(25);
		 * 
		 * int exponente = 321;
		 * 
		 * BigInteger potencia = base.pow(exponente);
		 * 
		 * System.out.println(potencia);
		 */
		
//		double aleatorio = (int)(Math.random()*100); 
//		// números pseudoaleatorios. Math.random(); y con casting trunca la cifra decimal.
//		
//		System.out.println(aleatorio);
		
		
		/* Math.Round(); tiene sobrecarga de métodos, cuando en una clase tenemos 2 metodos con el mismo nombre.
			es posible hacer esto siempre y cuando reciban parametros diferentes y devuelven tipos diferentes.
			
		*/
//		
//		int aleatorio = Math.round((float)(Math.random()*100));
//		
//		System.out.println(aleatorio);
		
//		int absoluto = Math.abs(-45); // valor absoluto de los numéros.
//		
//		System.out.println(absoluto); 
		
		int mayor = Math.max(3, 7);
		 // nos devuelve el valor más grande de la comparación.  
		
		System.out.println(mayor);
		

	}

}
