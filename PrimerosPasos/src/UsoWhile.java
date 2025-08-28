import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sistema de validación de contraseña dummy y no es complejo.
		
		String clave="Lunes";
		
		String pass = "";
		
		while(clave.equals(pass)==false) { 
		/*
		 * Valida que lo que se ingresa es correcto o esta en estado true.
		 * 
		*/
			
			pass=JOptionPane.showInputDialog("Introduce contraseña"); 
			/*Pide la contraseña nuevamente, mediante el joptionpane para ver que
			 * que se ingrese correctamente y en la linea que sigue va a validar.
			 * */
			
			if(clave.equals(pass)==false) 
				System.out.println("Contraseña incorrecta");
			/*El if valida que es una contraseña incorrecta o correcta */
		}
		System.out.println("Acceso correcto");
		

	}

}
