
public class UsoConstantes {

	// constante de clase siempre por convención debe de ir en mayusculas.
	private static final double PI=3.1416;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ejemplo=9;
		 
		//ejemplo=15; esto da error por la palabra reservada final y no se puede 
		//cambiar el valor como una variable común.

		final double apulgadas=2.54;
		
		int pulgadas=7;
		
		// apulgadas = 28.4; esto no se puede hacer porque tiene la palabra reservada final constante.
		
		double resultado=pulgadas*apulgadas;
		System.out.println(resultado);
		
		
		
		
		
		
	}

}
