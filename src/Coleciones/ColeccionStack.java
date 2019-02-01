package Coleciones;

import java.util.ArrayDeque;
import java.util.Stack;

public class ColeccionStack {

	public static void main(String[] args) {
		Stack<String> miColeccion = new Stack<String>();
		miColeccion.push("Collection");
		miColeccion.push("List");
		miColeccion.push("Set");
		miColeccion.push("SortedSet");
		miColeccion.push("Map");

		while (!miColeccion.isEmpty()) {
			// Pon tu código aqui
			System.out.println(miColeccion.pop());

		}
	}
}
