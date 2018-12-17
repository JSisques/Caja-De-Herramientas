package Strings;

import java.util.StringTokenizer;

public class DividirStrings {

	public static void main(String[] args) {

		DividirStrings test = new DividirStrings();
		String ejemplo = "Uno dos tres cuatro";

		// Metodo 1: Utilizando String Tokenizer
		test.conTokenizer(ejemplo);

		// Metodo 2: Utilizando Split
		test.conSplit(ejemplo);
	}

	public void conTokenizer(String cadena) {
		System.out.println("Utilizando StringTokenizer:");
		// Creamos el objeto
		StringTokenizer srt = new StringTokenizer(cadena);

		// Imprimimos el numero de tokens que tiene la cadena de caracteres
		System.out.println("La cadena tiene " + srt.countTokens() + " elementos");

		// Mientras que la cadena de caracteres tenga mas tokens imprimiremos cada uno
		// de ellos
		while (srt.hasMoreTokens()) {
			System.out.println(srt.nextToken() + " ");
		}
		
		//Separador para que no quede todo junto
		System.out.println("");
	}

	public void conSplit(String cadena) {
		System.out.println("Utilizando Split:");
		/*
		 * Creamos un array que en cada posicion tenga el valor que haya antes de un
		 * espacio En split se indica que elemento va a hacer de separador
		 * Se pueden usar expresiones como [*|/] para indicar que "cortaria" cuando
		 * se encontrase un asterisco o un slash.
		 */
		String[] srt = cadena.split(" ");

		// Imprimimos la longitud del array
		System.out.println("La cadena tiene " + srt.length + " elementos");

		/*
		 *  Implementamos un blucle for para recorrer todas las posiciones del array
		 *  y asi ir mostrandolas
		 */
		for (int i = 0; i < srt.length; i++) {
			System.out.println(srt[i] + " ");
		}
		
		//Separador para que no quede todo junto
		System.out.println("");
	}
}
