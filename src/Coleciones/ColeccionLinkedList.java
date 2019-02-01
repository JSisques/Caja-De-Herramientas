package Coleciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ColeccionLinkedList {

	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		String elto;
		Iterator<String> paseador = miColeccion.iterator();
		while (paseador.hasNext()) {
			elto = paseador.next();
			if (elto.charAt(0) == 'S')
				paseador.remove();
			else
				System.out.println(elto);
		}
	}
}
