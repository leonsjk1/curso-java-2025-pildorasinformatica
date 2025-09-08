
public class UsoCoches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche renault = new Coche(); 
		/*Se crea un objeto de tipo coche y se puede acceder al 
		 * comportamiento o propiedades.
		 * 
		 * */
		
		renault.ancho = 1520.3;
		
		renault.arrancar();
		
		Coche mazda = new Coche();
		
		mazda.color = "Azul";
		
		mazda.girar();
		
		mazda.setRuedas(2);
		
		System.out.println("El coche tiene: " + mazda.getRuedas() + " ruedas" );
		// El valor que toma es cero, ya que el número que tiene el tipo entero por defecto es 
		// un cero y depende del tipo de variable con el que se haya creado.
		
	}

}
