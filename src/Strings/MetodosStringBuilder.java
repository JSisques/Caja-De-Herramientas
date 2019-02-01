package Strings;

import java.util.Scanner;

public class MetodosStringBuilder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		StringBuilder text = new StringBuilder(scan.nextLine());

		// Medir la longitud de la cadena
		System.out.println(text.length());

		// Añade X al final de la cadena
		System.out.println(text.append("."));

		// Inserta X en la posicion indicada
		System.out.println(text.insert(3, "."));

		// Cambia el caracter (char) de una posicion por el indicado
		text.setCharAt(1, '.');
		System.out.println(text);

		//Devuelve el caracter que se encuentra en la posición indicada
		System.out.println(text.charAt(0));

		// Devuelve la posición de la primera aparicion del caracter
		System.out.println(text.indexOf("A"));

		// Devuelve la posición de la ultima aparicion del caracter
		System.out.println(text.lastIndexOf("A"));

		//Devuelve la subcadena comprendida entre dos posiciones, si no se especifica el segundo número cogerá hasta el finañ
		System.out.println(text.substring(0,4));
		
		// Elimina los caracteres desde la posición inicio hasta el final
		System.out.println(text.delete(1,4));

		// Invierte el contenido de una cadena
		System.out.println(text.reverse());

		//Devuelve el string equivalente
		System.out.println(text.toString());

	}

}
