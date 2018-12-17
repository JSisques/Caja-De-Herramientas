package Strings;

public class SeparadorMiles {

	public static void main(String[] args) {
		SeparadorMiles test = new SeparadorMiles();
		String cifra = "1234567890";
		
		System.out.println(test.separarMiles(cifra));

	}

	public String separarMiles(String cifra) {
		// Se crea un StringBuilder a partir del String cifra (el parametro)
		StringBuilder aux = new StringBuilder(cifra);
		
		// Se le da la vuelta
		aux.reverse();
		
		/*
		 * Indicamos en una variable las posiciones donde se va a insertar el punto
		 * En este caso el primer punto se inserta en la posicion 3
		 */
		int posicion = 3;
		
		//Bucle que se ejecuta mientras no lleguemos al final del numero
		while (posicion < aux.length()) {
			// Se inserta el punto en la posicion adecuada
			aux.insert(posicion, '.');
			
			//Indicamos la siguiente posicion donde insertar el punto
			posicion += 4;
		}
		
		//Le damos otra vez la vuelta para ponerlo como deberia estar
		aux.reverse();
		
		//El stringBuilder se pasa a String y se devuelve
		return aux.toString();
	}
}
