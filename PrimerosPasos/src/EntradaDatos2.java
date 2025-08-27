import javax.swing.*;

public class EntradaDatos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = javax.swing.JOptionPane.showInputDialog("Introduce tu nombre porfavor"); 
		
		// la linea que se agrega es el paquete directo sin hacer la importación habitual colocando el import -----"".
		
		
		// Show input dialog es una ventana de dialogo.
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
		// No se puede utilizar int con JOptionPane se tiene que buscar un método de parseo.
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu salario")); 
		// El mismo caso para lo que es un parseo de enteros a decimales.
		
		
		System.out.println("Te llamas " + nombre_usuario + " Y el año que viene tendras " +
		(edad+1) + " años. Y tienes un salario de: " + salario);
		
		
		
	}
	

}
