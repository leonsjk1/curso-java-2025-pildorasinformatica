import javax.swing.JOptionPane;

public class UsoFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int resultado = 1; // el valor se inicializa en 1 para que se pueda realizar la operación y 
							// no multiplicar el valor por cero.
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número ")); 
		// Se pide el numero por el cual se mostrará el factorial
		
		for (int i = numero; i > 0; i--) resultado = resultado*i;
		/* El valor inicia con 1 y se multiplica por el valor que se desea saber su factorial
		 * después el valor se compara en la condición del for, si el valor almacenado en
		 * resultado es mayor entonces continua con el siguiente valor y se decrementa el valor de
		 * i que obtiene un 4 como en el ejemplo que observamos, o dependiendo del número del JOption
		 * que pedimos el factorial, es el valor que reemplazara a el valor de resultado.
		 * 
		 * 
		 * */
		
		System.out.println("El factorial de " + numero + " es " + resultado);
		// Se obtiene el factorial.
		
		// solo hay un problema que el resultado se va a desbordar por el tipo de 
		// el valor que ocupa en los positivos porque solo acepta un rango el tipo int.
		
		//BIGinteger ayudaria para manejar números enormes como tip importante importante.
	}

}
