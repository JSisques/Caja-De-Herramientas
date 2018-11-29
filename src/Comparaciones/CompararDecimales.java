package Comparaciones;

public class CompararDecimales {

	public static void main(String[] args) {
		double original = 2;
		double root = Math.sqrt(original);
		double rootSquared = root * root;
		/*
		 * Para comparar 2 numeros decimales hay que crear la constante EPSILON con el
		 * valor correspondiente Basicamente decirle que si la diferencia entre dos
		 * numeros es muy pequeña que no lo tenga en cuenta, EPSILON siempre es 1E-12
		 * (Da igual si la "e se pone en mayusculas o minusculas")
		 */
		final double EPSILON = 1e-12;
		// Asi se quedaria el if
		if (Math.abs(rootSquared - original) < EPSILON) {
			System.out.println("They are the same");
		} else {
			System.out.println("rootSquared is " + rootSquared);
		}
	}

}
