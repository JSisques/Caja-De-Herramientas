package Algoritmos;

public class SumarDigitosTarjetaCredito {
	/**
	 * 
	 * @author javi 
	 * Codigo para separar las unidades de un numero n
	 * 
	 */

	public static void main(String[] args) {
		int n = 365; //Aqui el numero
		int sum = 0; //Aqui la suma

		while (n > 0) {
			// n % 10 coge las unidades de un numero n
			int digit = n % 10;
			sum += digit;
			n = n / 10;
		}
		System.out.println(sum);
	}

}
