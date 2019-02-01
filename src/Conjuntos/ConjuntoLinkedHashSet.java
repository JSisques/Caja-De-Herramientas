package Conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConjuntoLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> numeros = new LinkedHashSet<String>();
		numeros.addAll(Arrays.asList("Uno", "Dos", "Tres", "Cuatro"));
		
		// Conjunto resultante LinkedHashSet
		for (String elto : numeros) {
			System.out.println(elto);
		}
		
		HashSet<String> numeros1 = new HashSet<String>();
		numeros1.addAll(Arrays.asList("Uno", "Dos", "Tres", "Cuatro"));
		
		// Conjunto resultante HashSet
		System.out.println();
		for (String elto : numeros1) {
			System.out.println(elto);
		}
		
		TreeSet<String> numeros2 = new TreeSet<String>();
		numeros2.addAll(Arrays.asList("Uno", "Dos", "Tres", "Cuatro"));
		
		// Conjunto resultante TreeSet
		System.out.println();
		for (String elto : numeros2) {
			System.out.println(elto);
		}
	}

}
