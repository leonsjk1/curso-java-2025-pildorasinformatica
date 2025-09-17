package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Coche micoche1 = new Coche();
		
		micoche1.setColor("Rojo");
		
		Furgoneta mifurgoneta1= new Furgoneta(7, 580);
		/* En la clase furgoneta podemos acceder a los métodos creados en 
		 * la clase Coche, pudiendo ver que los métodos en concreto para
		 * la clase Coche se heredan al nuevo objeto de tipo Furgoneta.
		 * 
		 * */
		
		mifurgoneta1.setColor("Azul");
		
		mifurgoneta1.setAsientosCuero("Si");
		
		mifurgoneta1.setClimatizador("Si");
		
		System.out.println(micoche1.getPrecio() + "\n" 
				+ " color coche: " + micoche1.getColor() 
				+ "\n" + micoche1.getAncho());
		
		System.out.println(mifurgoneta1.getRuedas() + "\n" 
				+ mifurgoneta1.dimeDatosFurgoneta() + "\n" 
				+ " color furgoneta: " + mifurgoneta1.getColor());
		
		/* Al imprimir los datos tambien podemos acceder a los métodos de asignación
		 * setter para definir los valores de la nueva instancia del objeto de tipo
		 * furgoneta.
		 * */
		
		
//		Coche coche1 = new Coche();
//		
//		coche1.setAsientosCuero("Si");
//		
//		System.out.println("Peso: "+ coche1.getPeso());
//		
//		System.out.println("Precio: "+ coche1.getPrecio());
		
		
//		Coche renault = new Coche(); 
//		/*Se crea un objeto de tipo coche y se puede acceder al 
//		 * comportamiento o propiedades.
//		 * 
//		 * */
//		
//		renault.ancho = 1520.3;
//		
//		renault.arrancar();
//		
//		Coche mazda = new Coche();
//		
//		mazda.color = "Azul";
//		
//		mazda.girar();
//		
//		mazda.setRuedas(2);
//		
//		System.out.println("El coche tiene: " + mazda.getRuedas() + " ruedas" );
//		// El valor que toma es cero, ya que el número que tiene el tipo entero por defecto es 
//		// un cero y depende del tipo de variable con el que se haya creado.
//		
		/*
		 * Coche renault = new Coche();
		 * 
		 * renault.arrancar();
		 * 
		 * Coche mazda = new Coche();
		 * 
		 * mazda.girar();
		 * 
		 * mazda.setRuedas(3);
		 */

//		System.out.println("El coche tiene: " + mazda.getRuedas() + " ruedas");
//
//		System.out.println("El renault tiene: " + renault.getRuedas());
		/*
		 * Los objetos que creamos serán diferentes para cada uno de sus constructores y
		 * con estados iniciales diferentes dependiendo de la condición que agreguemos
		 * para validar.
		 * 
		 *
		 */
		
		/*
		 * System.out.println("El mazda tiene color: " + mazda.getColor());
		 * 
		 * renault.setColor("rojo"); // Si quiero cambiar el estado inicial. Debo de
		 * acceder al método setter del método que modifique.
		 * 
		 * System.out.println("renault: " + renault.getColor());
		 */
		

	}

}
