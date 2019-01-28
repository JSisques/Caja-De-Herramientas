package Strings;

public class ClaseStringBuilder {

	public static void main(String[] args) {

		String ejemplo = "Esternocleidomastoideo";

		StringBuilder palabra = new StringBuilder(ejemplo);

		// Devuelve la longitud de la palabra
		System.out.println(palabra.length());

		// Añade X al final de la cadena
		System.out.println(palabra.append("."));

		// Inserta X en la posicion indicada
		System.out.println(palabra.insert(3, "."));

		// Cambia el caracter (char) de una posicion por el indicado
		palabra.setCharAt(1, '.');
		System.out.println(palabra);
	}

}
