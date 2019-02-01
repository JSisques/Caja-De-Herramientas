package Conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntoTreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> numeros = new TreeSet<Integer>();
		//numeros.add(20);
		numeros.add(4);
		numeros.add(6);
		numeros.add(8);
		numeros.add(10);
		numeros.add(15);
		numeros.add(18);
		numeros.add(21);

		// Conjunto resultante
		for (Integer elto : numeros) {
			System.out.println(elto);
		}
		
		//Ejemplo con Strings
		TreeSet<String> palabra = new TreeSet<String>();
		//numeros.add(20);
		palabra.addAll(Arrays.asList("Agua Agua Hola Fuera Coco Yayo".split(" ")));


		// Conjunto resultante
		for (String elto : palabra) {
			System.out.println(elto);
		}
	}

}
