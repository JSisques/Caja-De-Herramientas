package Coleciones;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class ColeccionPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> miColeccion = new LinkedList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		
		//Para sacar el primer elemento y ponerlo al final
		//Lo unico es que si es priorutyQueue ordena alfabeticamente
		//PriorityQueue ordena la lista de forma predeterminada
		miColeccion.add(miColeccion.poll());
		
		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}

}
