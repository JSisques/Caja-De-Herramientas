package Coleciones;

import java.util.ArrayList;
import java.util.Iterator;

public class MetodoIterator {

	public static void main(String[] args) {

		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");

//		for (int i = 0; i < miColeccion.size(); i++) {
//			String palabra = miColeccion.get(i);
//
//			if (palabra.charAt(0) == 'S') {
//				miColeccion.remove(i);
//				i--;
//			}
//		}
//
//		for (String string : miColeccion) {
//			System.out.println(string);
//		}

		//Usando iterator para borrar elementos de una coleccion
		String elemento;
		Iterator<String> paseador = miColeccion.iterator();
		while (paseador.hasNext()) {
			elemento = paseador.next();
			System.out.println(elemento);
		}

		//Forma incomoda 
		int i = 0;
		for (String elto : miColeccion) {
			if (elto.startsWith("S")) {
				miColeccion.remove(i);
			}
			i++;
		}

	}

}
