import javax.swing.JOptionPane;

public class UsoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mail = JOptionPane.showInputDialog("Introduce email");
		
		int arroba = 0; /* Se crea una variable de tipo int contador para hacer la 
						*  validación de tener solo un arroba para la validación del correo
						*  electrónico.
						*
						*/
		
		boolean punto = false; 
		// Se crea esta variable en la actualización del programa para validar que por lo menos tenga
		// un punto o más para que el correo sea valido de momento ya que después de avanzar en el curso
		// veremos las expresiones regulares.
		
		for (int i = 0; i < mail.length(); i++) { 
		/*
			El mail.length() nos devuelve el metodo, la longitud de lo que ingresemos como valor;
			para asi ajustar en funcion de lo que se introduzca, la longitud correcta para cada caso
			especifico.
		*/ 
			
			if(mail.charAt(i)=='@') arroba++; 
			
			// el arroba ++ guarda con la iteración del primer for el elemento,
			// y asi hasta que termina de validar. si encuentra varios @ entonces 
			// los almacenara en el contador hasta que termine de validar la cadena.
			
		
			
			if(mail.charAt(i)=='.') punto=true; 
			// Esta validación pregunta si encuentra puntos, que cambie el valor a true 
			// y los almacena en cada iteración validando que el mail es correcto, que por lo
			// menos hay un punto en el email.
			
		}
		
		
		if(arroba==1 && punto == true) System.out.println("Mail Correcto"); 
		
		/* 
		 * Arroba ahora es 1 y se valida con los ampersand que las 2 condiciones se cumplan para que
		 * el valor del mail sea correcto y la variable punto == true para la condición que se hizo en
		 * el anterior for.
		 * 
		 * */
		
		else System.out.println("Mail incorrecto");
		
		
		
//		if(arroba == true) System.out.println("Mail Correcto"); 
//		/* el termino arroba que es de tipo boolean en una condición de tipo if 
//		 * siempre sera true sin que se haga la comparación de esta manera arroba == true
//		 * porque esto es igual a dejar el termino booleano sin la comparativa ya que es
//		 * un booleano.
//		 * */
//		
//		else System.out.println("Mail incorrecto");
//		
//		for(int i = 55; i > 45; i--) { 
//			
			/* Este ejemplo nos manda los valores de forma diferente pero abordando
			 * el ejemplo anterior y con el mismo resultado pero en ves de hacer el incremento,
			 * decrementa 10 veces hasta cumplir la condicion y en ves de ser mayor al número, 
			 * es menor.
			 * 
			*/
			//System.out.println("Leonardo " + i + " numero de veces impresas");
			// el contador i nos da el número de veces que imprimimos el valor en la consola.
			 
		//}
		
		
		/* Ejercicio siguiente se hara la validación de un correo electrónico para comprobar si una
			dirrección de correo electrónico que introduce el usuario, es correcta dependiendo del
			@ arroba, si lleva o no lleva. Utilizando JOptionPane.
		
		*/
		
		
		
	}

}
