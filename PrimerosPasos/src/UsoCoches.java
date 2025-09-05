
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
		
	}

}
