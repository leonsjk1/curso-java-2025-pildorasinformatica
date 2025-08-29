import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String genero="";
		
		do {
			
			genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
			
		} while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false); 
		/* Ignora si es mayuscula o minuscula y si la condición es falsa entonces que vuelva a 
		 * repetir la petición de la ventana una y otra vez hasta que se cumpla la condición para
		 * continuar con el programa.
		 * 
		 * */
		
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
		
		/*altura int recibe un entero pero la opción JOptionPane manda un String como valor,
		 * lo que se hizo fue recurrir al método estatico Integer de la clase Integer para parsear el 
		 * valor de tipo string a tipo entero para pasar de texto a valor entero y poder almacenar en 
		 * la variable el valor que queremos.
		 * 
		 * */
		
		int pesoIdeal=0;
		
		if(genero.equalsIgnoreCase("H")) pesoIdeal=altura-110;
		else if(genero.equalsIgnoreCase("M")) pesoIdeal=altura-120;
		
		System.out.println("Tu peso ideal es: " + pesoIdeal);
		
	}

}
